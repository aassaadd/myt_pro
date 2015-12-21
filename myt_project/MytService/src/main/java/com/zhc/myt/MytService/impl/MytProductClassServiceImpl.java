package com.zhc.myt.MytService.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytCustomerServiceLog;
import com.zhc.myt.MytDao.entity.MytCustomerServiceLogExample;
import com.zhc.myt.MytDao.entity.MytProductClass;
import com.zhc.myt.MytDao.entity.MytProductClassExample;
import com.zhc.myt.MytDao.mapper.MytProductClassMapper;
import com.zhc.myt.MytService.MytProductClassService;


@Service
public class MytProductClassServiceImpl implements MytProductClassService {
	
	@Autowired
	private MytProductClassMapper mapper;

	public MytProductClassServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytProductClass t) {
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
	public void delete(MytProductClass t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytProductClass t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytProductClass getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytProductClass> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytProductClassExample example = new MytProductClassExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytProductClass> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytProductClass> re = new ReturnPage<MytProductClass>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytProductClass> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytProductClassExample example = new MytProductClassExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytProductClass> content = mapper.selectByExample(example);
		return content;
	}

}
