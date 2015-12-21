package com.zhc.myt.MytRestful.service.impl;

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
import com.zhc.myt.MytDao.entity.MytMerchant;
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytDao.entity.MytUserExample;
import com.zhc.myt.MytDao.entity.MytWxUser;
import com.zhc.myt.MytDao.entity.MytWxUserExample;
import com.zhc.myt.MytDao.mapper.MytMerchantMapper;
import com.zhc.myt.MytDao.mapper.MytUserMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytLoginService;

@Service
public class MytLoginServiceImpl implements MytLoginService {

	@Autowired
	private MytUserMapper mapper;
	@Autowired
	private MytMerchantMapper mytMerchantMapper;
	public MytLoginServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String, Object> login(String userName, String userPassword) {
		// TODO Auto-generated method stub
		if (userName == null || userName.equals("") || userPassword == null
				|| userPassword.equals("")) {
			return null;
		}

		MytUserExample example = new MytUserExample();
		example.or().andUserNameEqualTo(userName);
//				.andUserPasswordEqualTo(MD5Util.getMD5Lower(userPassword));
		List<MytUser> list = mapper.selectByExample(example);
		if (list.size() > 0) {
			Cache service = (Cache) EhcacheUtil.getCache("tokenCache");
			String token = UUIDUtil.getUUID();
			MytUser user = list.get(0);
			//判断用户名密码是否相同
			if(!MD5Util.getMD5Lower(userPassword).equals(user.getUserPassword())){
				return null;
			}
			// 判断 是否商户删除状态
			if (user.getUserClass()!=null && user.getUserClass().equals("1")) {
				MytMerchant mytMerchant = mytMerchantMapper
						.selectByPrimaryKey(user.getPartentId());
				if (mytMerchant == null || mytMerchant.getStatus().equals("0")) {
					return null;
				}
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
