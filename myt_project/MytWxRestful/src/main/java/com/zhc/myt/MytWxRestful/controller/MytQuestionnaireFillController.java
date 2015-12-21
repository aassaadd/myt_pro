package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytDao.entity.MytQuestionnaireFill;
import com.zhc.myt.MytService.MytQuestionnaireFillService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytQuestionnaireFill")
public class MytQuestionnaireFillController extends BaseController {
	
	@Autowired
	private MytQuestionnaireFillService service;

	public MytQuestionnaireFillController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytQuestionnaireFill mytQuestionnaireFill) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytQuestionnaireFill.setCreateId(currentUserId);
		mytQuestionnaireFill.setOptId(currentUserId);
		try {
			service.add(mytQuestionnaireFill);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaireFill);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytQuestionnaireFill mytQuestionnaireFill) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytQuestionnaireFill.setOptId(currentUserId);
		mytQuestionnaireFill.setId(id);
		try {
			service.update(mytQuestionnaireFill);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaireFill);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytQuestionnaireFill mytQuestionnaireFill = new MytQuestionnaireFill();
		mytQuestionnaireFill.setId(id);
		mytQuestionnaireFill.setOptId(currentUserId);
		try {
			service.delete(mytQuestionnaireFill);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaireFill);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytQuestionnaireFill mytQuestionnaireFill = service
				.getById(id);

		if (mytQuestionnaireFill == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaireFill);

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
