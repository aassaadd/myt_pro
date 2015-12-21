package com.zhc.myt.MytService.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.RRolePermission;
import com.zhc.myt.MytDao.entity.RRolePermissionExample;
import com.zhc.myt.MytDao.entity.RUserRole;
import com.zhc.myt.MytDao.entity.RUserRoleExample;
import com.zhc.myt.MytDao.mapper.RRolePermissionMapper;
import com.zhc.myt.MytService.RRolePermissionService;

@Service
public class RRolePermissionServiceImpl implements RRolePermissionService {
	
	@Autowired
	private RRolePermissionMapper mapper;

	public RRolePermissionServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(RRolePermission t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setCreateDate(d);
		t.setOptDate(d);
//		t.setCreateId(currentUserId);
//		t.setOptId(currentUserId);
		t.setStatus("1");
		mapper.insertSelective(t);
	}

	@Override
	public void delete(RRolePermission t) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(t.getId());
	}

	@Override
	public void update(RRolePermission t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public RRolePermission getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<RRolePermission> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		RRolePermissionExample example = new RRolePermissionExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<RRolePermission> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<RRolePermission> re = new ReturnPage<RRolePermission>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<RRolePermission> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		RRolePermissionExample example = new RRolePermissionExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<RRolePermission> content = mapper.selectByExample(example);
		return content;
	}

}
