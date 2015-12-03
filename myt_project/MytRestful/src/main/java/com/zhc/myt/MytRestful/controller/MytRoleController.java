package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytDao.entity.MytRole;
import com.zhc.myt.MytRestful.service.MytRoleService;

@RestController
@RequestMapping(value = "/api/manage/mytRole")
public class MytRoleController extends BaseController{
	@Autowired
	private MytRoleService mytRoleService;
	
	public MytRoleController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(@RequestBody MytRole mytRole) {
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
	public Map<String, Object> update(
			@PathVariable(value = "id") Integer id,
			@RequestBody MytRole mytRole) {
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
	public Map<String, Object> delete(
			@PathVariable(value = "id") Integer id) {
		MytRole mytRole = new MytRole();
		mytRole.setId(id);
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
	public Map<String, Object> getById(
			@PathVariable(value = "id") Integer id) {
		MytRole mytRole = mytRoleService.getById(id);
		
		

		if (mytRole == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytRole);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(
			HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytRoleService.getByList(params));
		}
		Integer pageNumber =Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytRoleService.getByPage(pageNumber,
				pageSize, params));

	}
}
