package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytDao.entity.MytCustomerServiceLog;
import com.zhc.myt.MytService.MytCustomerServiceLogService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytCustomerServiceLog")
public class MytCustomerServiceLogController extends BaseController {

	@Autowired
	private MytCustomerServiceLogService mytCustomerServiceLogService;

	public MytCustomerServiceLogController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytCustomerServiceLog mytCustomerServiceLog) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytCustomerServiceLog.setCreateId(currentUserId);
		mytCustomerServiceLog.setOptId(currentUserId);
		try {
			mytCustomerServiceLogService.add(mytCustomerServiceLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytCustomerServiceLog);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytCustomerServiceLog mytCustomerServiceLog) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytCustomerServiceLog.setOptId(currentUserId);
		mytCustomerServiceLog.setId(id);
		try {
			mytCustomerServiceLogService.update(mytCustomerServiceLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytCustomerServiceLog);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytCustomerServiceLog mytCustomerServiceLog = new MytCustomerServiceLog();
		mytCustomerServiceLog.setId(id);
		mytCustomerServiceLog.setOptId(currentUserId);
		try {
			mytCustomerServiceLogService.delete(mytCustomerServiceLog);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytCustomerServiceLog);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytCustomerServiceLog mytCustomerServiceLog = mytCustomerServiceLogService
				.getById(id);

		if (mytCustomerServiceLog == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytCustomerServiceLog);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytCustomerServiceLogService.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytCustomerServiceLogService.getByPage(pageNumber,
				pageSize, params));

	}
}
