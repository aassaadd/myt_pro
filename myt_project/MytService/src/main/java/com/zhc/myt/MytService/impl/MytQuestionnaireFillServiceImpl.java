package com.zhc.myt.MytService.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytQuestionnaire;
import com.zhc.myt.MytDao.entity.MytQuestionnaireExample;
import com.zhc.myt.MytDao.entity.MytQuestionnaireFill;
import com.zhc.myt.MytDao.entity.MytQuestionnaireFillExample;
import com.zhc.myt.MytDao.mapper.MytQuestionnaireFillMapper;
import com.zhc.myt.MytService.MytQuestionnaireFillService;


@Service
public class MytQuestionnaireFillServiceImpl implements
		MytQuestionnaireFillService {
	
	@Autowired
	private MytQuestionnaireFillMapper mapper;

	public MytQuestionnaireFillServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytQuestionnaireFill t) {
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
	public void delete(MytQuestionnaireFill t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytQuestionnaireFill t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytQuestionnaireFill getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytQuestionnaireFill> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytQuestionnaireFillExample example = new MytQuestionnaireFillExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytQuestionnaireFill> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytQuestionnaireFill> re = new ReturnPage<MytQuestionnaireFill>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytQuestionnaireFill> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytQuestionnaireFillExample example = new MytQuestionnaireFillExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytQuestionnaireFill> content = mapper.selectByExample(example);
		return content;
	}

}
