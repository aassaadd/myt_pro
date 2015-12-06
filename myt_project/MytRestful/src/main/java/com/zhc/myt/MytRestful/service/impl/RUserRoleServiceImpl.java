package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytAppModule;
import com.zhc.myt.MytDao.entity.MytAppModuleExample;
import com.zhc.myt.MytDao.entity.RUserRole;
import com.zhc.myt.MytDao.entity.RUserRoleExample;
import com.zhc.myt.MytDao.mapper.RUserRoleMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.RUserRoleService;
@Service
public class RUserRoleServiceImpl implements RUserRoleService {
	@Autowired
	private RUserRoleMapper mapper;

	public RUserRoleServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(RUserRole t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setCreateDate(d);
		t.setOptDate(d);
		t.setCreateId(currentUserId);
		t.setOptId(currentUserId);
		t.setStatus("1");
		mapper.insertSelective(t);
	}

	@Override
	public void delete(RUserRole t) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(t.getId());
	}

	@Override
	public void update(RUserRole t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public RUserRole getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<RUserRole> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		RUserRoleExample example = new RUserRoleExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<RUserRole> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<RUserRole> re = new ReturnPage<RUserRole>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<RUserRole> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		RUserRoleExample example = new RUserRoleExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<RUserRole> content = mapper.selectByExample(example);
		return content;
	}

}
