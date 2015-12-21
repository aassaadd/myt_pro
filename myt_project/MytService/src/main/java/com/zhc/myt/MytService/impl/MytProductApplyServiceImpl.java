package com.zhc.myt.MytService.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytProductApply;
import com.zhc.myt.MytDao.entity.MytProductApplyExample;
import com.zhc.myt.MytDao.entity.MytProductClass;
import com.zhc.myt.MytDao.entity.MytProductClassExample;
import com.zhc.myt.MytDao.mapper.MytProductApplyMapper;
import com.zhc.myt.MytDao.mapper.MytProductClassMapper;
import com.zhc.myt.MytService.MytProductApplyService;
@Service
public class MytProductApplyServiceImpl implements MytProductApplyService {

	@Autowired
	private MytProductApplyMapper mapper;

	public MytProductApplyServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytProductApply t) {
		// TODO Auto-generated method stub
		Date d = new Date();
		t.setCreateDate(d);
		t.setOptDate(d);
		t.setStatus("1");
		mapper.insertSelective(t);
	}

	@Override
	public void delete(MytProductApply t) {
		// TODO Auto-generated method stub
		Date d = new Date();
		t.setOptDate(d);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytProductApply t) {
		// TODO Auto-generated method stub
		Date d = new Date();
		t.setOptDate(d);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytProductApply getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytProductApply> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytProductApplyExample example = new MytProductApplyExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytProductApply> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytProductApply> re = new ReturnPage<MytProductApply>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytProductApply> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytProductApplyExample example = new MytProductApplyExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytProductApply> content = mapper.selectByExample(example);
		return content;
	}

}
