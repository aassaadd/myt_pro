package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytMerchant;
import com.zhc.myt.MytDao.entity.MytMerchantExample;
import com.zhc.myt.MytDao.entity.MytRole;
import com.zhc.myt.MytDao.entity.MytRoleExample;
import com.zhc.myt.MytDao.mapper.MytMerchantMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytMerchantService;

@Service
public class MytMerchantServiceImpl implements MytMerchantService {

	@Autowired
	private MytMerchantMapper mytMerchantMapper;

	public MytMerchantServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytMerchant t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setCreateDate(d);
		t.setOptDate(d);
		t.setCreateId(currentUserId);
		t.setOptId(currentUserId);
		t.setStatus("1");
		mytMerchantMapper.insertSelective(t);

	}

	@Override
	public void delete(MytMerchant t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		t.setStatus("0");
		mytMerchantMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytMerchant t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		mytMerchantMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytMerchant getById(int id) {
		// TODO Auto-generated method stub
		return mytMerchantMapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytMerchant> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytMerchantExample example = new MytMerchantExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart=(pageNumber - 1) * pageSize;
		Integer limtEnd=pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytMerchant> content = mytMerchantMapper.selectByExample(example);
		Integer count = mytMerchantMapper.countByExample(example);
		ReturnPage<MytMerchant> re = new ReturnPage<MytMerchant>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytMerchant> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytMerchantExample example = new MytMerchantExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytMerchant> content = mytMerchantMapper.selectByExample(example);
		return content;
	}

}
