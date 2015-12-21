package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytDao.entity.MytFeedback;
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytService.MytFeedbackService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytFeedback")
public class MytFeedbackController extends BaseController {

	
	@Autowired
	private MytFeedbackService service;
	
	public MytFeedbackController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytFeedback mytFeedback) {
		MytUser user = new MytUser();
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		user.setOptId(currentUserId);
		if (mytFeedback.getWxUserId() == 0) {
			// 如果为0表示获取当前用户
			mytFeedback.setWxUserId(MytSystem.getCurrentUserId());
		}
		mytFeedback.setCreateId(currentUserId);
		mytFeedback.setOptId(currentUserId);
		
		try {
			service.add(mytFeedback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytFeedback);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytFeedback mytFeedback) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytFeedback.setOptId(currentUserId);
		mytFeedback.setId(id);
		try {
			service.update(mytFeedback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytFeedback);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytFeedback mytFeedback = new MytFeedback();
		mytFeedback.setId(id);
		mytFeedback.setOptId(currentUserId);
		try {
			service.delete(mytFeedback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytFeedback);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytFeedback mytFeedback = service
				.getById(id);

		if (mytFeedback == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytFeedback);

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
