package com.zhc.myt.MytWxRestful.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import com.zhc.myt.MytCommon.util.BeanUtils;
import com.zhc.myt.MytCommon.util.EhcacheUtil;
import com.zhc.myt.MytCommon.util.MD5Util;
import com.zhc.myt.MytCommon.util.UUIDUtil;
import com.zhc.myt.MytDao.entity.MytWxUser;
import com.zhc.myt.MytDao.entity.MytWxUserExample;
import com.zhc.myt.MytDao.mapper.MytWxUserMapper;
import com.zhc.myt.MytWxRestful.common.MytSystem;
import com.zhc.myt.MytWxRestful.service.MytLoginService;
@Service
public class MytLoginServiceImpl implements MytLoginService {

	@Autowired
	private MytWxUserMapper mapper;
	
	public MytLoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public Map<String, Object> login(String userName, String userPassword) {
		// TODO Auto-generated method stub
		if (userName == null || userName.equals("") || userPassword == null
				|| userPassword.equals("")) {
			return null;
		}

		MytWxUserExample example = new MytWxUserExample();
		example.or().andUserNameEqualTo(userName);
//				.andUserPasswordEqualTo(MD5Util.getMD5Lower(userPassword));
		List<MytWxUser> list = mapper.selectByExample(example);
		if (list.size() > 0) {
			Cache service = (Cache) EhcacheUtil.getCache("tokenCache");
			String token = UUIDUtil.getUUID();
			MytWxUser user = list.get(0);
			//判断用户名密码是否相同
			if(!MD5Util.getMD5Lower(userPassword).equals(user.getUserPassword())){
				return null;
			}
			//判断用户是否无效
			if(user.getStatus().equals("0")){
				return null;
			}
			Map<String, Object> rmap = BeanUtils.Bean2Map(user);
			rmap.put("token", token);
			rmap.remove("userPassword");
			service.put(new Element(MytSystem.SYS_CACHE_PREFIX + token, user
					.getId()));
			return rmap;
		}
		return null;
	}

}
