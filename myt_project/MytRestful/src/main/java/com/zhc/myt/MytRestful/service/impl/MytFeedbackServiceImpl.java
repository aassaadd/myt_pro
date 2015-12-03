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
import com.zhc.myt.MytDao.entity.MytFeedback;
import com.zhc.myt.MytDao.entity.MytFeedbackExample;
import com.zhc.myt.MytDao.mapper.MytFeedbackMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytRestful.service.MytFeedbackService;

@Service
public class MytFeedbackServiceImpl implements MytFeedbackService {
	
	@Autowired
	private MytFeedbackMapper mapper;

	public MytFeedbackServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytFeedback t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setFbkType("0");//未查看
		t.setCreateDate(d);
		t.setOptDate(d);
		t.setCreateId(currentUserId);
		t.setOptId(currentUserId);
		t.setStatus("1");
		mapper.insertSelective(t);
	}

	@Override
	public void delete(MytFeedback t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytFeedback t) {
		// TODO Auto-generated method stub
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytFeedback getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytFeedback> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytFeedbackExample example = new MytFeedbackExample();
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytFeedback> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytFeedback> re = new ReturnPage<MytFeedback>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytFeedback> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytFeedbackExample example = new MytFeedbackExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytFeedback> content = mapper.selectByExample(example);
		return content;
	}

}
