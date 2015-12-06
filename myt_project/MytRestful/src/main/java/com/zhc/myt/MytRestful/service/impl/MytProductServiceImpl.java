package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytProduct;
import com.zhc.myt.MytDao.entity.MytProductClass;
import com.zhc.myt.MytDao.entity.MytProductClassExample;
import com.zhc.myt.MytDao.entity.MytProductExample;
import com.zhc.myt.MytDao.mapper.MytProductMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytProductService;

@Service
public class MytProductServiceImpl implements MytProductService {
	
	@Autowired
	private MytProductMapper mapper;

	public MytProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytProduct t) {
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
	public void delete(MytProduct t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytProduct t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytProduct getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytProduct> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		
		MytProductExample example = new MytProductExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytProduct> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytProduct> re = new ReturnPage<MytProduct>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytProduct> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytProductExample example = new MytProductExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytProduct> content = mapper.selectByExample(example);
		return content;
	}

}
