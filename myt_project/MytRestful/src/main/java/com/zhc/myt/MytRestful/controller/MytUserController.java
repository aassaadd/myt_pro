package com.zhc.myt.MytRestful.controller;

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

import com.zhc.myt.MytDao.entity.MytAppModule;
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytDao.entity.RRolePermission;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytAppModuleService;
import com.zhc.myt.MytRestful.service.MytAppService;
import com.zhc.myt.MytRestful.service.MytUserService;
import com.zhc.myt.MytRestful.service.RRolePermissionService;

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
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytUser mytUser) {
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

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		MytUser mytUser = new MytUser();
		mytUser.setId(id);
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
			user=mytUserService.getById(MytSystem.getCurrentUserId());
		} else {
			user=mytUserService.getById(id);
		}
		Rparams.put("roleId", user.getRoleId());
		Rparams.put("entityName", "myt_app");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);

		//通过关系查询
		List<Integer> intList=new ArrayList<Integer>();
		for(RRolePermission r:Rlist){
			intList.add(r.getEntId());
		}
		params.put("id@in", intList);
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
			user=mytUserService.getById(MytSystem.getCurrentUserId());
		} else {
			user=mytUserService.getById(id);
		}
		Rparams.put("roleId", user.getRoleId());
		Rparams.put("entityName", "myt_app_module");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);

		//通过关系查询
		List<Integer> intList=new ArrayList<Integer>();
		for(RRolePermission r:Rlist){
			intList.add(r.getEntId());
		}
		params.put("appId", appId);
		params.put("id@in", intList);
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
			user=mytUserService.getById(MytSystem.getCurrentUserId());
		} else {
			user=mytUserService.getById(id);
		}
		Rparams.put("roleId", user.getRoleId());
		Rparams.put("entityName", "myt_app_module");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);

		//通过关系查询
		List<Integer> intList=new ArrayList<Integer>();
		for(RRolePermission r:Rlist){
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
