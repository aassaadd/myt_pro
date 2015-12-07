package com.zhc.myt.MytRestful.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytApp;
import com.zhc.myt.MytDao.entity.MytAppExample;
import com.zhc.myt.MytDao.entity.MytCustomerServiceLog;
import com.zhc.myt.MytDao.entity.MytCustomerServiceLogExample;
import com.zhc.myt.MytDao.entity.MytRoleExample;
import com.zhc.myt.MytDao.entity.MytUserExample;
import com.zhc.myt.MytDao.mapper.MytAppMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytAppService;
@Service
public class MytAppServiceImpl implements MytAppService {
	
	@Autowired
	private MytAppMapper mapper;

	public MytAppServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytApp t) {
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
	public void delete(MytApp t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytApp t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytApp getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytApp> getByPage(Integer pageNumber, Integer pageSize,
			Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytAppExample example = new MytAppExample();
		MytAppExample.Criteria cr=example.or();
		ExampleUtils.Map2ExampleMethod(cr, params);
		//模糊查询
		if(params.containsKey("id@in")){
			List<Integer> ints=(List<Integer>)params.get("id@in");
			if(ints.size()>0){
				cr.andIdIn(ints);
			}else{
				cr.andIdEqualTo(-1);
			}
			
		}
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("sort ASC,create_date DESC");
		List<MytApp> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytApp> re = new ReturnPage<MytApp>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytApp> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytAppExample example = new MytAppExample();
		MytAppExample.Criteria cr=example.or();
		ExampleUtils.Map2ExampleMethod(cr, params);
		//模糊查询
		if(params.containsKey("id@in")){
			List<Integer> ints=(List<Integer>)params.get("id@in");
			if(ints.size()>0){
				cr.andIdIn(ints);
			}else{
				cr.andIdEqualTo(-1);
			}
			
		}
		example.setOrderByClause("sort ASC,create_date DESC");
		List<MytApp> content = mapper.selectByExample(example);
		return content;
	}

}
