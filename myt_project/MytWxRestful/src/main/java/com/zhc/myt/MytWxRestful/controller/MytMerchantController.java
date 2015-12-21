package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytDao.entity.MytMerchant;
import com.zhc.myt.MytService.MytMerchantService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytMerchant")
public class MytMerchantController extends BaseController {
	
	@Autowired
	private MytMerchantService mytMerchantService;

	public MytMerchantController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(@RequestBody MytMerchant mytMerchant) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytMerchant.setCreateId(currentUserId);
		mytMerchant.setOptId(currentUserId);
		try {
			mytMerchantService.add(mytMerchant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytMerchant);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(
			@PathVariable(value = "id") Integer id,
			@RequestBody MytMerchant mytMerchant) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytMerchant.setOptId(currentUserId);
		mytMerchant.setId(id);
		try {
			mytMerchantService.update(mytMerchant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytMerchant);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(
			@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytMerchant mytMerchant = new MytMerchant();
		mytMerchant.setId(id);
		mytMerchant.setOptId(currentUserId);
		try {
			mytMerchantService.delete(mytMerchant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytMerchant);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(
			@PathVariable(value = "id") Integer id) {
		MytMerchant  mytMerchant = mytMerchantService.getById(id);

		if (mytMerchant == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytMerchant);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(
			HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytMerchantService.getByList(params));
		}
		Integer pageNumber =Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytMerchantService.getByPage(pageNumber,
				pageSize, params));

	}
}
