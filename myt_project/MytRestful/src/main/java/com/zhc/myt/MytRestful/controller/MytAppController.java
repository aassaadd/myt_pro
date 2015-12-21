package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytDao.entity.MytApp;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytService.MytAppService;

@RestController
@RequestMapping(value = "/api/manage/mytApp")
public class MytAppController extends BaseController {

	@Autowired
	private MytAppService service; 
	
	public MytAppController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytApp mytApp) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytApp.setCreateId(currentUserId);
		mytApp.setOptId(currentUserId);
		try {
			service.add(mytApp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytApp);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytApp mytApp) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytApp.setOptId(currentUserId);
		mytApp.setId(id);
		try {
			service.update(mytApp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytApp);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytApp mytApp = new MytApp();
		mytApp.setId(id);
		mytApp.setOptId(currentUserId);
		try {
			service.delete(mytApp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytApp);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytApp mytApp = service
				.getById(id);

		if (mytApp == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytApp);

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
