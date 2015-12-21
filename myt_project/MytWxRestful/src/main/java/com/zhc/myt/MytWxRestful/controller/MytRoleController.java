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
import com.zhc.myt.MytDao.entity.MytApp;
import com.zhc.myt.MytDao.entity.MytAppModule;
import com.zhc.myt.MytDao.entity.MytRole;
import com.zhc.myt.MytDao.entity.RRolePermission;
import com.zhc.myt.MytService.MytAppModuleService;
import com.zhc.myt.MytService.MytAppService;
import com.zhc.myt.MytService.MytRoleService;
import com.zhc.myt.MytService.MytUserService;
import com.zhc.myt.MytService.RRolePermissionService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytRole")
public class MytRoleController extends BaseController {
	@Autowired
	private MytRoleService mytRoleService;
	@Autowired
	private MytUserService mytUserService;

	@Autowired
	private MytAppService mytAppService;
	@Autowired
	private MytAppModuleService mytAppModuleService;
	@Autowired
	private RRolePermissionService rRolePermissionService;

	public MytRoleController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(@RequestBody MytRole mytRole) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytRole.setCreateId(currentUserId);
		mytRole.setOptId(currentUserId);
		try {
			mytRoleService.add(mytRole);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytRole);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytRole mytRole) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytRole.setOptId(currentUserId);
		mytRole.setId(id);
		try {
			mytRoleService.update(mytRole);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytRole);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytRole mytRole = new MytRole();
		mytRole.setId(id);
		mytRole.setOptId(currentUserId);
		try {
			mytRoleService.delete(mytRole);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytRole);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytRole mytRole = mytRoleService.getById(id);

		if (mytRole == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytRole);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytRoleService.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytRoleService.getByPage(pageNumber,
				pageSize, params));

	}

	@RequestMapping(value = "/{id}/mytApp", method = RequestMethod.GET)
	public Map<String, Object> getMytAppByPage(
			@PathVariable(value = "id") Integer id, HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		Map<String, Object> Rparams = new HashMap<String, Object>();
		Rparams.put("roleId", id);
		Rparams.put("entityName", "myt_app");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);

		// 通过关系查询
		List<Integer> intList = new ArrayList<Integer>();
		for (RRolePermission r : Rlist) {
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
		Rparams.put("roleId", id);
		Rparams.put("entityName", "myt_app_module");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);

		// 通过关系查询
		List<Integer> intList = new ArrayList<Integer>();
		for (RRolePermission r : Rlist) {
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
		Rparams.put("roleId", id);
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

	@RequestMapping(value = "/{id}/mytApp", method = RequestMethod.PUT)
	public Map<String, Object> updateMytAppList(
			@PathVariable(value = "id") Integer id,
			@RequestBody List<Integer> intList) {
		Map<String, Object> Rparams = new HashMap<String, Object>();
		Rparams.put("roleId", id);
		Rparams.put("entityName", "myt_app");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);
		// 逐一删除
		for (RRolePermission r : Rlist) {
			rRolePermissionService.delete(r);
		}
		// 通过关系查询
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id@in", intList);
		List<MytApp> list = mytAppService.getByList(params);
		// 逐一添加
		for (MytApp a : list) {
			RRolePermission r = new RRolePermission();
			r.setRoleId(id);
			r.setEntityName("myt_app");
			r.setEntId(a.getId());
			rRolePermissionService.add(r);
		}
		return getReturnMapSuccess(list);

	}
	@RequestMapping(value = "/{id}/mytAppModule", method = RequestMethod.PUT)
	public Map<String, Object> updateMytAppModuleList(
			@PathVariable(value = "id") Integer id,
			@RequestBody List<Integer> intList) {
		Map<String, Object> Rparams = new HashMap<String, Object>();
		Rparams.put("roleId", id);
		Rparams.put("entityName", "myt_app_module");
		List<RRolePermission> Rlist = rRolePermissionService.getByList(Rparams);
		// 逐一删除
		for (RRolePermission r : Rlist) {
			rRolePermissionService.delete(r);
		}
		// 通过关系查询
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("id@in", intList);
		List<MytAppModule> list = mytAppModuleService.getByList(params);
		// 逐一添加
		for (MytAppModule a : list) {
			RRolePermission r = new RRolePermission();
			r.setRoleId(id);
			r.setEntityName("myt_app_module");
			r.setEntId(a.getId());
			rRolePermissionService.add(r);
		}
		return getReturnMapSuccess(list);

	}
}
