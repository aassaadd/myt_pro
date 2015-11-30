package com.zhc.myt.MytRestful.service;

import java.util.Map;

import com.zhc.myt.MytDao.entity.MytUser;

/**
 * @author  zhc E-mail:zhc@beimingsmart.com
 * @date 创建时间：2015年8月28日 上午10:51:45
 * @version 1.0
 * @parameter
 * @since
 * @return 
 */

public interface MytUserService extends BaseService<MytUser>{

	
	/**
	 * 登录接口
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	public Map<String,Object> login(String userName,String userPassword);
	
	
	
}
