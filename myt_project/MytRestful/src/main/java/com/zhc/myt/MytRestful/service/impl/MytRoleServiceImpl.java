package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytCommon.util.MD5Util;
import com.zhc.myt.MytDao.entity.MytRole;
import com.zhc.myt.MytDao.entity.MytRoleExample;
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytDao.entity.MytUserExample;
import com.zhc.myt.MytDao.mapper.MytRoleMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytRoleService;

@Service
public class MytRoleServiceImpl implements MytRoleService {

	@Autowired
	private MytRoleMapper mytRoleMapper;
	
	public MytRoleServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytRole t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setCreateDate(d);
		t.setOptDate(d);
		t.setCreateId(currentUserId);
		t.setOptId(currentUserId);
		t.setStatus("1");
		mytRoleMapper.insertSelective(t);
	}

	@Override
	public void delete(MytRole t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		t.setStatus("0");
		mytRoleMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytRole t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		mytRoleMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytRole getById(int id) {
		// TODO Auto-generated method stub
		return mytRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytRole> getByPage(Integer pageNumber, Integer pageSize,
			Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytRoleExample example = new MytRoleExample();
		
		//模糊查询
		if(params.containsKey("roleName@like")){
			MytRoleExample.Criteria cr= ExampleUtils.Map2ExampleMethod(example.or(), params);
			cr.andRoleNameLike("%"+params.get("roleName@like").toString()+"%");
		}
		//------
		Integer limtStart=(pageNumber - 1) * pageSize;
		Integer limtEnd=pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytRole> content = mytRoleMapper.selectByExample(example);
		Integer count = mytRoleMapper.countByExample(example);
		ReturnPage<MytRole> re = new ReturnPage<MytRole>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytRole> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytRoleExample example = new MytRoleExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		//模糊查询
		if(params.containsKey("roleName@like")){
			MytRoleExample.Criteria cr= ExampleUtils.Map2ExampleMethod(example.or(), params);
			cr.andRoleNameLike("%"+params.get("roleName@like").toString()+"%");
		}
		example.setOrderByClause("create_date DESC");
		List<MytRole> content = mytRoleMapper.selectByExample(example);
		return content;
	}

}
