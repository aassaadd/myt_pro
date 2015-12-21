package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytDao.entity.MytWxUser;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytService.MytWxUserService;

@RestController
@RequestMapping(value = "/api/manage/mytWxUser")
public class MytWxUserController extends BaseController {

	@Autowired
	private MytWxUserService service;
	public MytWxUserController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytWxUser mytWxUser) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytWxUser.setCreateId(currentUserId);
		mytWxUser.setOptId(currentUserId);
		try {
			service.add(mytWxUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytWxUser);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytWxUser mytWxUser) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytWxUser.setOptId(currentUserId);
		mytWxUser.setId(id);
		try {
			service.update(mytWxUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytWxUser);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytWxUser mytWxUser = new MytWxUser();
		mytWxUser.setId(id);
		mytWxUser.setOptId(currentUserId);
		try {
			service.delete(mytWxUser);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytWxUser);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytWxUser mytWxUser = service
				.getById(id);

		if (mytWxUser == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytWxUser);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(service.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(service.getByPage(pageNumber,
				pageSize, params));

	}
}
