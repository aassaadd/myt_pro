package com.zhc.myt.MytService.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.ehcache.search.parser.MCriteria.Like;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhc.myt.MytCommon.ReturnPage;
import com.zhc.myt.MytCommon.util.ExampleUtils;
import com.zhc.myt.MytCommon.util.OrdersUtils;
import com.zhc.myt.MytDao.entity.MytOrders;
import com.zhc.myt.MytDao.entity.MytOrdersExample;
import com.zhc.myt.MytDao.entity.MytProductClass;
import com.zhc.myt.MytDao.entity.MytProductClassExample;
import com.zhc.myt.MytDao.entity.MytUserExample;
import com.zhc.myt.MytDao.entity.MytWxUser;
import com.zhc.myt.MytDao.mapper.MytOrdersMapper;
import com.zhc.myt.MytService.MytOrdersService;
import com.zhc.myt.MytService.MytWxUserService;

@Service
public class MytOrdersServiceImpl implements MytOrdersService {

	@Autowired
	private MytOrdersMapper mapper;

	@Autowired
	private MytWxUserService mytWxUserService;

	public MytOrdersServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(MytOrders t) {
		// TODO Auto-generated method stub
		// Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOrderNo(OrdersUtils.getOrderNo());
		t.setCreateDate(d);
		t.setOptDate(d);
		// t.setCreateId(currentUserId);
		// t.setOptId(currentUserId);
		t.setStatus("1");
		mapper.insertSelective(t);
	}

	@Override
	public void delete(MytOrders t) {
		// TODO Auto-generated method stub
		// Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		// t.setOptId(currentUserId);
		t.setStatus("0");
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public void update(MytOrders t) {
		// TODO Auto-generated method stub
		// Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Date d = new Date();
		t.setOptDate(d);
		// t.setOptId(currentUserId);
		mapper.updateByPrimaryKeySelective(t);
	}

	@Override
	public MytOrders getById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public ReturnPage<MytOrders> getByPage(Integer pageNumber,
			Integer pageSize, Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytOrdersExample example = new MytOrdersExample();
		MytOrdersExample.Criteria cr = example.or();
		ExampleUtils.Map2ExampleMethod(cr, params);
		Integer limtStart = (pageNumber - 1) * pageSize;
		Integer limtEnd = pageSize;
		example.setLimitStart(limtStart);
		example.setLimitEnd(limtEnd);
		// 特殊查询
		if (params.containsKey("orderStatus@not")) {
			cr.andOrderStatusNotEqualTo(params.get("orderStatus@not")
					.toString());
		}
		if (params.containsKey("userNickname@like")) {
			Map<String, Object> m = new HashMap<String, Object>();
			m.put("userNickname@like", params.get("userNickname@like"));
			List<MytWxUser> list = mytWxUserService.getByList(m);

			List<Integer> values = new ArrayList<Integer>();
			if (list.size() > 0) {
				for (MytWxUser mwu : list) {
					values.add(mwu.getId());
				}
			} else {
				values.add(0);
			}

			cr.andWxUserIdIn(values);
		}
		example.setOrderByClause("create_date DESC");
		List<MytOrders> content = mapper.selectByExample(example);
		Integer count = mapper.countByExample(example);
		ReturnPage<MytOrders> re = new ReturnPage<MytOrders>(count, pageNumber,
				pageSize, content);
		return re;
	}

	@Override
	public List<MytOrders> getByList(Map<String, Object> params) {
		// TODO Auto-generated method stub
		MytOrdersExample example = new MytOrdersExample();
		ExampleUtils.Map2ExampleMethod(example.or(), params);
		example.setOrderByClause("create_date DESC");
		List<MytOrders> content = mapper.selectByExample(example);
		return content;
	}

}
