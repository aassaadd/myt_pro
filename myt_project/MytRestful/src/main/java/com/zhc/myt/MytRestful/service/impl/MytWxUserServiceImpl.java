package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.BeanUtils;
import com.zhc.myt.MytCommon.util.EhcacheUtil;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytCommon.util.MD5Util;
import com.zhc.myt.MytCommon.util.UUIDUtil;
import com.zhc.myt.MytDao.entity.MytMerchant;
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytDao.entity.MytUserExample;
import com.zhc.myt.MytDao.entity.MytWxUser;
import com.zhc.myt.MytDao.entity.MytWxUserExample;
import com.zhc.myt.MytDao.mapper.MytWxUserMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytWxUserService;

@Service
public class MytWxUserServiceImpl implements MytWxUserService {
	@Autowired
	private MytWxUserMapper mapper;

	public MytWxUserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytWxUser t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setCreateDate(d);
		t.setOptDate(d);
		t.setCreateId(currentUserId);
		t.setOptId(currentUserId);
		t.setStatus("1");
		if (t.getUserPassword() != null && !t.getUserPassword().equals("")) {
			t.setUserPassword(MD5Util.getMD5Lower(t.getUserPassword()));
		}
		mapper.insertSelective(t);
	}

	@Override
	public void delete(MytWxUser t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytWxUser t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		if (t.getUserPassword() != null && !t.getUserClass().equals("")) {
			t.setUserPassword(MD5Util.getMD5Lower(t.getUserPassword()));
		}
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytWxUser getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytWxUser> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytWxUserExample example = new MytWxUserExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		//模糊查询
		if(params.containsKey("userNickname@like")){
			MytWxUserExample.Criteria cr= ExampleUtils.Map2ExampleMethod(example.or(), params);
			cr.andUserNameLike("%"+params.get("userNickname@like").toString()+"%");
		}
		Integer limtStart=(pageNumber - 1) * pageSize;
		Integer limtEnd=pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytWxUser> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytWxUser> re = new ReturnPage<MytWxUser>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytWxUser> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytWxUserExample example = new MytWxUserExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		//模糊查询
		if(params.containsKey("userNickname@like")){
			MytWxUserExample.Criteria cr= ExampleUtils.Map2ExampleMethod(example.or(), params);
			cr.andUserNameLike("%"+params.get("userNickname@like").toString()+"%");
		}
		example.setOrderByClause("create_date DESC");
		List<MytWxUser> content = mapper.selectByExample(example);
		return content;
	}
	
}
