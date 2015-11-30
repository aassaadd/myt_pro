package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytLoginLog;
import com.zhc.myt.MytDao.entity.MytLoginLogExample;
import com.zhc.myt.MytDao.mapper.MytLoginLogMapper;
import com.zhc.myt.MytRestful.service.MytLoginLogService;
@Service
public class MytLoginLogServiceImpl implements MytLoginLogService{

	@Autowired
	private MytLoginLogMapper mytLoginLogMapper;
	
	@Override
	public void add(MytLoginLog t) {
		// TODO Auto-generated method stub
		Date d = new Date();
		t.setCreateDate(d);	
		mytLoginLogMapper.insertSelective(t);
	}

	@Override
	public void delete(MytLoginLog t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MytLoginLog t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MytLoginLog getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ReturnPage<MytLoginLog> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytLoginLogExample example = new MytLoginLogExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart=(pageNumber - 1) * pageSize;
		Integer limtEnd=limtStart+pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytLoginLog> content = mytLoginLogMapper.selectByExample(example);
		Integer count = mytLoginLogMapper.countByExample(example);
		ReturnPage<MytLoginLog> re = new ReturnPage<MytLoginLog>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytLoginLog> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytLoginLogExample example = new MytLoginLogExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytLoginLog> content = mytLoginLogMapper.selectByExample(example);
		return content;
	}



}
