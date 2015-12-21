package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytDao.entity.MytProduct;
import com.zhc.myt.MytService.MytProductService;
import com.zhc.myt.MytWxRestful.common.MytSystem;
@RestController
@RequestMapping(value = "/api/manage/mytProduct")
public class MytProductController extends BaseController {

	@Autowired
	private MytProductService service;
	public MytProductController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytProduct mytProduct) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytProduct.setCreateId(currentUserId);
		mytProduct.setOptId(currentUserId);
		try {
			service.add(mytProduct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProduct);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytProduct mytProduct) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytProduct.setOptId(currentUserId);
		mytProduct.setId(id);
		try {
			service.update(mytProduct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProduct);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytProduct mytProduct = new MytProduct();
		mytProduct.setId(id);
		mytProduct.setOptId(currentUserId);
		try {
			service.delete(mytProduct);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProduct);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytProduct mytProduct = service
				.getById(id);

		if (mytProduct == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProduct);

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
