package com.zhc.myt.MytService.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytDao.entity.MytFile;
import com.zhc.myt.MytDao.entity.MytFileExample;
import com.zhc.myt.MytDao.mapper.MytFileMapper;
import com.zhc.myt.MytService.MytFileService;

@Service
public class MytFileServiceImpl implements MytFileService {
	
	@Autowired
	private MytFileMapper mytFileMapper;
 
	public MytFileServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytFile t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setCreateDate(d);
		t.setOptDate(d);
//		t.setCreateId(currentUserId);
//		t.setOptId(currentUserId);
		t.setStatus("1");
		mytFileMapper.insertSelective(t);
	}

	@Override
	public void delete(MytFile t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		t.setStatus("0");
		mytFileMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytFile t) {
		// TODO Auto-generated method stub
//		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
//		t.setOptId(currentUserId);
		mytFileMapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytFile getById(int id) {
		// TODO Auto-generated method stub
		return mytFileMapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytFile> getByPage(Integer pageNumber, Integer pageSize,
			Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytFileExample example = new MytFileExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		Integer limtStart=(pageNumber - 1) * pageSize;
		Integer limtEnd=pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		example.setOrderByClause("create_date DESC");
		List<MytFile> content = mytFileMapper.selectByExample(example);
		Integer count = mytFileMapper.countByExample(example);
		ReturnPage<MytFile> re = new ReturnPage<MytFile>(count,
				pageNumber, pageSize, content);
		return re;
	}

	@Override
	public List<MytFile> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytFileExample example = new MytFileExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytFile> content = mytFileMapper.selectByExample(example);
		return content;
	}


}
