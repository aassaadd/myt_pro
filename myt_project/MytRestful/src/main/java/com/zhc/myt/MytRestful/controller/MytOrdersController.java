package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytDao.entity.MytOrders;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytService.MytOrdersService;

@RestController
@RequestMapping(value = "/api/manage/mytOrders")
public class MytOrdersController extends BaseController {
	
	@Autowired
	private  MytOrdersService  service;

	public MytOrdersController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytOrders mytOrders) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytOrders.setCreateId(currentUserId);
		mytOrders.setOptId(currentUserId);
		try {
			service.add(mytOrders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytOrders mytOrders) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytOrders.setOptId(currentUserId);
		mytOrders.setId(id);
		try {
			service.update(mytOrders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytOrders mytOrders = new MytOrders();
		mytOrders.setId(id);
		mytOrders.setOptId(currentUserId);
		try {
			service.delete(mytOrders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytOrders mytOrders = service
				.getById(id);

		if (mytOrders == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

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
