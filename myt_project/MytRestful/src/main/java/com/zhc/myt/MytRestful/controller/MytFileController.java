package com.zhc.myt.MytRestful.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.zhc.myt.MytDao.entity.MytFile;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytService.MytFileService;

@RestController
@RequestMapping(value = "/api/manage/mytFile")
public class MytFileController extends BaseController {
	private static Logger LOGGER = LoggerFactory
			.getLogger(MytFileController.class);
	@Autowired
	private MytFileService mytFileService;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> updateFile(
			@RequestParam(value = "file") MultipartFile filedata,
			@RequestParam(value = "dir", defaultValue = "image") String dirName,
			HttpServletRequest request, HttpServletResponse response) {

		// 文件目录
		String savePath = MytSystem.getConfig("file_base_save_path");
		File uploadDir = new File(savePath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();// 创建文件根目录
		}

		// 文件保存目录URL
		// String saveUrl = request.getContextPath() + "/payFile/";
		String saveUrl = "/";
		// File file2 = new File(saveUrl);
		// if (!file2.exists()) {
		// file2.mkdir();// 创建文件根目录
		// }
		// 定义允许上传的文件扩展名
		HashMap<String, String> extMap = new HashMap<String, String>();
		extMap.put("image", "gif,jpg,jpeg,png,bmp");
		extMap.put("flash", "swf,flv");
		extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
		extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");
		// 最大文件大小
		long maxSize = 50000000;
		if (filedata == null) {
			// returnKindEditorMsg(getError("请选择文件。"), request, response);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("error", 1);
			result.put("message", "请选择文件。");
			return result;
		}
		// 检查目录
		if (!uploadDir.isDirectory()) {
			// returnKindEditorMsg(getError("上传目录不存在。"), request, response);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("error", 1);
			result.put("message", "上传目录不存在。");
			return result;

		}
		// 检查目录写权限
		if (!uploadDir.canWrite()) {
			// returnKindEditorMsg(getError("上传目录没有写权限。"), request, response);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("error", 1);
			result.put("message", "上传目录没有写权限。");
			return result;
		}
		if (!extMap.containsKey(dirName)) {
			// returnKindEditorMsg(getError("目录名不正确。"), request, response);
			Map<String, Object> result = new HashMap<String, Object>();
			result.put("error", 1);
			result.put("message", "目录名不正确。");
			return result;
		}
		// 文件保存目录URL 返回页面为前台使用
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String ymd = sdf.format(new Date());
		// 创建文件夹
		savePath += dirName + ymd + "/";
		// 修改url路径
		saveUrl += dirName + ymd + "/";
		File saveDirFile = new File(savePath);
		if (!saveDirFile.exists()) {
			saveDirFile.mkdirs();
		}
		// 保存相对路径到数据库 图片写入服务器
		if (filedata != null && !filedata.isEmpty()) {
			if (filedata.getSize() > maxSize) {
				// returnKindEditorMsg(getError("上传文件大小超过限制。"), request,
				// response);
				Map<String, Object> result = new HashMap<String, Object>();
				result.put("error", 1);
				result.put("message", "上传文件大小超过限制。");
				return result;
			}

			// 获得文件名
			String fileName = filedata.getOriginalFilename();
			// 获得扩展名
			String extensionName = fileName
					.substring(fileName.lastIndexOf(".") + 1);
			// 检查扩展名
			if (!Arrays.asList(extMap.get(dirName).split(",")).contains(
					extensionName)) {

				// returnKindEditorMsg(getError("上传文件扩展名是不允许的扩展名。\n只允许"
				// + extMap.get(dirName) + "格式."), request, response);
				Map<String, Object> result = new HashMap<String, Object>();
				result.put("error", 1);
				result.put("message",
						"上传文件扩展名是不允许的扩展名。\n只允许" + extMap.get(dirName) + "格式.");
				return result;

			}
			// 新的文件名=获取事件挫+。扩展名
			String newFileName = String.valueOf(java.lang.System
					.currentTimeMillis()) + "." + extensionName;
			MytFile mytFile = new MytFile();
			Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
			mytFile.setCreateId(currentUserId);
			mytFile.setOptId(currentUserId);
			try {
				saveFile(newFileName, filedata, savePath);
				// 保存savefile数据
				// 创建文件实体类

				mytFile.setFileName(newFileName);
				mytFile.setFileType(dirName);
				mytFile.setFileExtension(extensionName);
				mytFile.setFileSrc(savePath + "/" + newFileName);
				mytFile.setFileUrl(saveUrl + newFileName);
				mytFile.setFileSize((int) filedata.getSize());
				mytFile.setCreateDate(new Date());
				mytFileService.add(mytFile);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// returnKindEditorMsg(getError("上传失败."), request, response);
				return getReturnMapFailure();
			}
			return getReturnMapSuccess(mytFile);

		}

		return getReturnMapFailure();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(
			@PathVariable(value = "id") Integer id,
			@RequestParam(value = "postMethod", required = false) String postMethod,
			HttpServletRequest request, HttpServletResponse response) {
		MytFile mytFile = mytFileService.getById(id);
		if (mytFile != null
				&& (postMethod != null && !postMethod.equals(""))
				&& (postMethod.equals("downLoad") || postMethod.equals("image"))) {
			File file = new File(mytFile.getFileSrc());
			InputStream fis = null;
			try {
				// 取得文件名。
				String filename = mytFile.getFileName();

				// 以流的形式下载文件。
				fis = new BufferedInputStream(new FileInputStream(file));
				// 清空response
				response.reset();
				// 设置response的Header

				response.addHeader("Content-Length", "" + file.length());
				OutputStream toClient = new BufferedOutputStream(
						response.getOutputStream());
				if (postMethod.equals("image")) {
					response.setContentType("image/png");
				} else {
					response.addHeader(
							"Content-Disposition",
							"attachment;filename=\""
									+ new String(filename.getBytes(),
											"ISO-8859-1") + "\"");
					response.setContentType("application/octet-stream");
				}

				byte[] bt = new byte[1024];
				int count;
				while ((count = fis.read(bt)) > 0)
					toClient.write(bt, 0, count);
				toClient.flush();
			} catch (IOException ex) {
				RuntimeException e = new RuntimeException(ex);
				LOGGER.error("下载文件失败.", e);
				return getReturnMapFailure();
			} finally {
				if (fis != null)
					try {
						fis.close();
					} catch (IOException e1) {
						RuntimeException e = new RuntimeException(e1);
						LOGGER.error("文件关闭失败.", e);
						return getReturnMapFailure();
					}
			}
			return getReturnMapSuccess(mytFile);
		} 
		return getReturnMapFailure("图片不存在");
		

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(
	// @RequestParam(value = "page") Integer pageNumber,
	// @RequestParam(value = "pageSize") Integer pageSize,
			HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytFileService.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytFileService.getByPage(pageNumber,
				pageSize, params));

		//
	}

	/**
	 * 保存分拣
	 * 
	 * @param newFileName
	 * @param filedata
	 * @param saveFilePath
	 * @throws Exception
	 */
	private void saveFile(String newFileName, MultipartFile filedata,
			String saveFilePath) throws Exception {

		// 构建文件目录
		File fileDir = new File(saveFilePath);
		if (!fileDir.exists()) {
			fileDir.mkdir();
		}
		FileOutputStream out = new FileOutputStream(saveFilePath + "/"
				+ newFileName);
		// 写入文件
		out.write(filedata.getBytes());
		out.flush();
		out.close();

	}
}
