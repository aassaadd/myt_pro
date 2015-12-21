package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytDao.entity.MytFeedback;
import com.zhc.myt.MytDao.entity.MytProduct;
import com.zhc.myt.MytDao.entity.MytProductClass;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytService.MytProductClassService;

@RestController
@RequestMapping(value = "/api/manage/mytProductClass")
public class MytProductClassController extends BaseController {
	
	@Autowired
	private MytProductClassService service;

	public MytProductClassController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytProductClass mytProductClass) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytProductClass.setCreateId(currentUserId);
		mytProductClass.setOptId(currentUserId);
		try {
			service.add(mytProductClass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductClass);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytProductClass mytProductClass) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytProductClass.setOptId(currentUserId);
		mytProductClass.setId(id);
		try {
			service.update(mytProductClass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductClass);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytProductClass mytProductClass = new MytProductClass();
		mytProductClass.setId(id);
		mytProductClass.setOptId(currentUserId);
		try {
			service.delete(mytProductClass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductClass);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytProductClass mytProductClass = service
				.getById(id);

		if (mytProductClass == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductClass);

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
