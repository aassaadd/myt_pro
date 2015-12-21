package com.zhc.WeiXinApi.common;

import java.util.HashMap;
import java.util.Map;

import com.zhc.WeiXinApi.common.utils.StaticUtils;
import com.zhc.myt.MytCommon.util.HttpRequestUtil;

public class WebApi {

	public WebApi() {
		// TODO Auto-generated constructor stub
	}

	public static String getAccessToken() {

		Map<String, String> param = new HashMap<String, String>();
		param.put("grant_type", "client_credential");
		param.put("appid", StaticUtils.APPID);
		param.put("secret", StaticUtils.APPSECRET);
		return HttpRequestUtil.get(StaticUtils.TOKEN_URL, param);
	}
}
