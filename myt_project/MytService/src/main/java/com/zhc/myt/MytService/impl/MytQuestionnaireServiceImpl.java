package com.zhc.myt.MytService.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytFeedback;
import com.zhc.myt.MytDao.entity.MytFeedbackExample;
import com.zhc.myt.MytDao.entity.MytQuestionnaire;
import com.zhc.myt.MytDao.entity.MytQuestionnaireExample;
import com.zhc.myt.MytDao.mapper.MytQuestionnaireMapper;
import com.zhc.myt.MytService.MytQuestionnaireService;

@Service
public class MytQuestionnaireServiceImpl implements MytQuestionnaireService {
	
	@Autowired
	private MytQuestionnaireMapper mapper;

	public MytQuestionnaireServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytQuestionnaire t) {
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
	public void delete(MytQuestionnaire t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytQuestionnaire t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytQuestionnaire getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytQuestionnaire> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytQuestionnaireExample example = new MytQuestionnaireExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytQuestionnaire> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytQuestionnaire> re = new ReturnPage<MytQuestionnaire>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytQuestionnaire> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytQuestionnaireExample example = new MytQuestionnaireExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytQuestionnaire> content = mapper.selectByExample(example);
		return content;
	}

}
