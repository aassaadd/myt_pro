package com.zhc.myt.MytRestful.controller;

import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytLoginLogService;
import com.zhc.myt.MytRestful.service.MytUserService;
import com.zhc.myt.MytCommon.enums.ReturnEnum;
import com.zhc.myt.MytCommon.util.ClientInfo;
import com.zhc.myt.MytDao.entity.MytLoginLog;
import com.zhc.myt.MytDao.entity.MytUser;

@RestController
@RequestMapping(value = "/api")
public class MytLoginCotroller extends BaseController {
	private static Logger LOGGER = LoggerFactory
			.getLogger(MytLoginCotroller.class);

	@Autowired
	private MytUserService mytUserService;

	@Autowired
	private MytLoginLogService mytLoginLogService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Map<String, Object> login(@RequestBody MytUser mytUser,
			HttpServletRequest request) {
		// -------------------------------------------------------------
		String agent = request.getHeader("user-agent");

		ClientInfo clientInfo = new ClientInfo(request.getHeader("user-agent"));
		MytLoginLog mytLoginLog = new MytLoginLog();
		// 获取核心浏览器名称并保存到登录信息对象（loginlog）的相应属性中
		mytLoginLog.setExplorerName(clientInfo.getExplorerName());
		mytLoginLog.setExplorerVer(clientInfo.getExplorerVer());
		mytLoginLog.setExplorerPlug(clientInfo.getExplorerPlug());
		mytLoginLog.setOsName(clientInfo.getOSName());
		mytLoginLog.setClientIp(request.getRemoteAddr());
		mytLoginLog.setClientName(request.getRemoteHost());
		mytLoginLog.setUserName(mytUser.getUserName());
		// -------------------------------------------------------------
		Map<String, Object> user = mytUserService.login(mytUser.getUserName(),
				mytUser.getUserPassword());
		if (user != null) {
			mytLoginLog.setType("1");//成功
			mytLoginLogService.add(mytLoginLog);
			return getReturnMapSuccess(user);
		}
		mytLoginLog.setType("0");//失败
		mytLoginLogService.add(mytLoginLog);
		return getReturnMapFailure("登陆失败");
	}

}
