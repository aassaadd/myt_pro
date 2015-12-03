package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytDao.entity.MytAdvertisement;
import com.zhc.myt.MytRestful.service.MytAdvertisementService;

@RestController
@RequestMapping(value = "/api/manage/mytAdvertisement")
public class MytAdvertisementController extends BaseController {
	
	@Autowired
	private MytAdvertisementService service; 

	public MytAdvertisementController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(
			@RequestBody MytAdvertisement mytAdvertisement) {
		try {
			service.add(mytAdvertisement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytAdvertisement);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytAdvertisement mytAdvertisement) {
		mytAdvertisement.setId(id);
		try {
			service.update(mytAdvertisement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytAdvertisement);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		MytAdvertisement mytAdvertisement = new MytAdvertisement();
		mytAdvertisement.setId(id);
		try {
			service.delete(mytAdvertisement);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytAdvertisement);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytAdvertisement mytAdvertisement = service
				.getById(id);

		if (mytAdvertisement == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytAdvertisement);

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
