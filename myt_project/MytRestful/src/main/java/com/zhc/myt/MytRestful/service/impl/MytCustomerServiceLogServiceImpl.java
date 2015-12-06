package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytCustomerServiceLog;
import com.zhc.myt.MytDao.entity.MytCustomerServiceLogExample;
import com.zhc.myt.MytDao.entity.MytMerchant;
import com.zhc.myt.MytDao.entity.MytMerchantExample;
import com.zhc.myt.MytDao.mapper.MytCustomerServiceLogMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytCustomerServiceLogService;

@Service
public class MytCustomerServiceLogServiceImpl implements
		MytCustomerServiceLogService {
	@Autowired
	private MytCustomerServiceLogMapper mapper;

	public MytCustomerServiceLogServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytCustomerServiceLog t) {
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
	public void delete(MytCustomerServiceLog t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytCustomerServiceLog t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytCustomerServiceLog getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytCustomerServiceLog> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytCustomerServiceLogExample example = new MytCustomerServiceLogExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytCustomerServiceLog> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytCustomerServiceLog> re = new ReturnPage<MytCustomerServiceLog>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytCustomerServiceLog> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytCustomerServiceLogExample example = new MytCustomerServiceLogExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytCustomerServiceLog> content = mapper.selectByExample(example);
		return content;
	}

}
