package com.zhc.myt.MytService.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytAdvertisement;
import com.zhc.myt.MytDao.entity.MytAdvertisementExample;
import com.zhc.myt.MytDao.mapper.MytAdvertisementMapper;
import com.zhc.myt.MytService.MytAdvertisementService;

@Service
public class MytAdvertisementServiceImpl implements MytAdvertisementService {
	
	@Autowired
	private MytAdvertisementMapper mapper;

	public MytAdvertisementServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytAdvertisement t) {
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
	public void delete(MytAdvertisement t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytAdvertisement t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytAdvertisement getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytAdvertisement> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytAdvertisementExample example = new MytAdvertisementExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytAdvertisement> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytAdvertisement> re = new ReturnPage<MytAdvertisement>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytAdvertisement> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytAdvertisementExample example = new MytAdvertisementExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytAdvertisement> content = mapper.selectByExample(example);
		return content;
	}

}
