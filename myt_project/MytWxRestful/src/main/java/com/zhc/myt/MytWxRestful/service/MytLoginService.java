package com.zhc.myt.MytWxRestful.service;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

public interface MytLoginService {
	/**
	 * 登录接口
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	@Transactional(rollbackFor=Exception.class) 
	public Map<String,Object> login(String userName,String userPassword);
	
}
