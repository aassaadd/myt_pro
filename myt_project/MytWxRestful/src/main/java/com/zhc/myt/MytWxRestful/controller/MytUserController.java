package com.zhc.myt.MytWxRestful.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytCommon.util.MD5Util;
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytDao.entity.RRolePermission;
import com.zhc.myt.MytService.MytAppModuleService;
import com.zhc.myt.MytService.MytAppService;
import com.zhc.myt.MytService.MytUserService;
import com.zhc.myt.MytService.RRolePermissionService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytUser")
public class MytUserController extends BaseController {

	@Autowired
	private MytUserService mytUserService;

	@Autowired
	private MytAppService mytAppService;
	@Autowired
	private MytAppModuleService mytAppModuleService;
	@Autowired
	private RRolePermissionService rRolePermissionService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(@RequestBody MytUser mytUser) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytUser.setCreateId(currentUserId);
		mytUser.setOptId(currentUserId);
		try {
			if (mytUser.getUserName() == null) {
				return getReturnMapFailure("用户名不能为空");
			}
			// 判断用户名唯一
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("userName", mytUser.getUserName());
			List<MytUser> list = mytUserService.getByList(params);
			if (list.size() > 0) {
				return getReturnMapFailure("用户名已存在");
			}
			mytUserService.add(mytUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytUser);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(
			@PathVariable(value = "id") Integer id,
			@RequestBody MytUser mytUser) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytUser.setOptId(currentUserId);
		mytUser.setId(id);
		try {
			mytUserService.update(mytUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytUser);

	}
	@RequestMapping(value = "/{id}/password", method = RequestMethod.PUT)
	public Map<String, Object> updatePassword(
			@PathVariable(value = "id") Integer id,
			@RequestBody Map<String,String> map) {
		//  		userPassword: '',//确认密码
		//        newUserPassword:'',新密码
		//        oldUserPassword:'',就密码
		MytUser user=new MytUser();
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		user.setOptId(currentUserId);
		if (id == 0) {
			// 如果为0表示获取当前用户
			user.setId(MytSystem.getCurrentUserId());
		} else {
			user.setId(id);
		}
		MytUser u=mytUserService.getById(user.getId());
		if(!map.containsKey("oldUserPassword") || map.get("oldUserPassword").trim().equals("")){
			return getReturnMapFailure("旧密码不能为空");
		}
		if(!MD5Util.getMD5Lower(map.get("oldUserPassword").trim()).equals(u.getUserPassword())){
			return getReturnMapFailure("旧密码不正确");
		}
		if(!map.containsKey("newUserPassword") || map.get("newUserPassword").trim().equals("")){
			return getReturnMapFailure("新密码不能为空");
		}
		if(!map.containsKey("userPassword") || !map.get("userPassword").trim().equals(map.get("newUserPassword").trim())){
			return getReturnMapFailure("两次密码输入不一致");
		}
		user.setUserPassword(map.get("newUserPassword").trim());
		try {
			mytUserService.update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(user);

	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytUser mytUser = new MytUser();
		mytUser.setId(id);
		mytUser.setOptId(currentUserId);
		try {
			mytUserService.delete(mytUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytUser);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytUser mytUser;
		if (id == 0) {
			// 如果为0表示获取当前用户
			mytUser = mytUserService.getById(MytSystem.getCurrentUserId());
		} else {
			mytUser = mytUserService.getById(id);
		}

		if (mytUser == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytUser);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytUserService.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytUserService.getByPage(pageNumber,
				pageSize, params));

	}

	@RequestMapping(value = "/{id}/mytApp", method = RequestMethod.GET)
	public Map<String, Object> getMytAppByPage(
			@PathVariable(value = "id") Integer id, HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		Map<String, Object> Rparams = new HashMap<String, Object>();
		MytUser user;
		if (id == 0) {
			// 如果为0表示获取当前用户
			user = mytUserService.getById(MytSystem.getCurrentUserId());
		} else {
			user = mytUserService.getById(id);
		}

		// 如果为超级管理员
		if (user.getUserClass().equals("0") && user.getUserType().equals("0")) {
			
		} else {
			
			Rparams.put("roleId", user.getRoleId());
			Rparams.put("entityName", "myt_app");
			List<RRolePermission> Rlist = rRolePermissionService
					.getByList(Rparams);

			// 通过关系查询
			List<Integer> intList = new ArrayList<Integer>();
			for (RRolePermission r : Rlist) {
				intList.add(r.getEntId());
			}
			params.put("id@in", intList);
		}
		params.put("status", "1");
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytAppService.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytAppService.getByPage(pageNumber,
				pageSize, params));

	}

	@RequestMapping(value = "/{id}/mytApp/{appId}/mytAppModule", method = RequestMethod.GET)
	public Map<String, Object> getMytAppModuleOnAppByPage(
			@PathVariable(value = "id") Integer id,
			@PathVariable(value = "appId") Integer appId,
			HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		Map<String, Object> Rparams = new HashMap<String, Object>();
		MytUser user;
		if (id == 0) {
			// 如果为0表示获取当前用户
			user = mytUserService.getById(MytSystem.getCurrentUserId());
		} else {
			user = mytUserService.getById(id);
		}
		// 如果为超级管理员
		if (user.getUserClass().equals("0") && user.getUserType().equals("0")) {

		} else {
			Rparams.put("roleId", user.getRoleId());
			Rparams.put("entityName", "myt_app_module");
			List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);

			// 通过关系查询
			List<Integer> intList = new ArrayList<Integer>();
			for (RRolePermission r : Rlist) {
				intList.add(r.getEntId());
			}
			params.put("id@in", intList);
		}
		params.put("status", "1");
		params.put("appId", appId);
	
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytAppModuleService.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytAppModuleService.getByPage(pageNumber,
				pageSize, params));

	}

	@RequestMapping(value = "/{id}/mytAppModule", method = RequestMethod.GET)
	public Map<String, Object> getMytAppModuleByPage(
			@PathVariable(value = "id") Integer id, HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		Map<String, Object> Rparams = new HashMap<String, Object>();
		MytUser user;
		if (id == 0) {
			// 如果为0表示获取当前用户
			user = mytUserService.getById(MytSystem.getCurrentUserId());
		} else {
			user = mytUserService.getById(id);
		}
		Rparams.put("roleId", user.getRoleId());
		Rparams.put("entityName", "myt_app_module");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);

		// 通过关系查询
		List<Integer> intList = new ArrayList<Integer>();
		for (RRolePermission r : Rlist) {
			intList.add(r.getEntId());
		}
		params.put("id@in", intList);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytAppModuleService.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytAppModuleService.getByPage(pageNumber,
				pageSize, params));

	}
}
