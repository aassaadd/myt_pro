package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytDao.entity.MytQuestionnaire;
import com.zhc.myt.MytService.MytQuestionnaireService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytQuestionnaire")
public class MytQuestionnaireController extends BaseController{
	
	@Autowired
	private MytQuestionnaireService service;

	public MytQuestionnaireController(){
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytQuestionnaire mytQuestionnaire) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytQuestionnaire.setCreateId(currentUserId);
		mytQuestionnaire.setOptId(currentUserId);
		try {
			service.add(mytQuestionnaire);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaire);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytQuestionnaire mytQuestionnaire) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytQuestionnaire.setOptId(currentUserId);
		mytQuestionnaire.setId(id);
		try {
			service.update(mytQuestionnaire);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaire);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytQuestionnaire mytQuestionnaire = new MytQuestionnaire();
		mytQuestionnaire.setId(id);
		mytQuestionnaire.setOptId(currentUserId);
		try {
			service.delete(mytQuestionnaire);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaire);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytQuestionnaire mytQuestionnaire = service
				.getById(id);

		if (mytQuestionnaire == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytQuestionnaire);

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
