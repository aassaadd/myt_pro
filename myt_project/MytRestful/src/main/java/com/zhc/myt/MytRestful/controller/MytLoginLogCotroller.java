package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytService.MytLoginLogService;

@RestController
@RequestMapping(value = "/api/manage/mytLoginLog")
public class MytLoginLogCotroller extends BaseController{
	
	@Autowired
	private MytLoginLogService mytLoginLogService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(
			HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(mytLoginLogService.getByList(params));
		}
		Integer pageNumber =Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(mytLoginLogService.getByPage(pageNumber,
				pageSize, params));

	}

}
