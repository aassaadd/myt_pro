package com.zhc.myt.MytRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhc.myt.MytDao.entity.MytOrders;
import com.zhc.myt.MytDao.entity.MytProduct;
import com.zhc.myt.MytDao.entity.MytProductApply;
import com.zhc.myt.MytDao.entity.MytProductClass;
import com.zhc.myt.MytDao.mapper.MytProductApplyMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytService.MytOrdersService;
import com.zhc.myt.MytService.MytProductApplyService;
import com.zhc.myt.MytService.MytProductService;

@RestController
@RequestMapping(value = "/api/manage/mytProductApply")
public class MytProductApplyController extends BaseController {

	@Autowired
	private MytProductApplyService service;
	@Autowired
	private MytOrdersService mytOrdersService;
	@Autowired
	private MytProductService mytProductService;

	public MytProductApplyController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(@RequestBody MytProductApply mytProductApply) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytProductApply.setCreateId(currentUserId);
		mytProductApply.setOptId(currentUserId);
		try {
			service.add(mytProductApply);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductApply);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytProductApply mytProductApply) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		// 如为审核通过
		if (mytProductApply.getState() != null
				&& mytProductApply.getState().equals("1")) {
			// 并下单,这时候的订单只是做为记录使用，货品数量默认为1可以修改
			MytProductApply oa = service.getById(mytProductApply.getId());
			MytProduct pro = mytProductService.getById(oa.getProId());
			if(!oa.getState().equals("1")){//防止重复审核
				MytOrders orders = new MytOrders();
				orders.setMchId(pro.getMchId());
				orders.setWxUserId(oa.getWxUserId());
				orders.setOrderBody(pro.getProName());
				orders.setOrderGoodsNum(1);
				orders.setOrderTotalFee(pro.getProTryPrice());
				orders.setOrderRealityFee(pro.getProTryPrice());// 申请支付金额
				orders.setProId(pro.getId());
				orders.setProName(pro.getProName());
				orders.setProOneFee(pro.getProTryPrice());
				orders.setProImgId(pro.getImgId());
				orders.setOrderStatus("S");// 订单提交
				orders.setCreateId(currentUserId);
				orders.setOptId(currentUserId);
				mytOrdersService.add(orders);	
				mytProductApply.setOrderId(orders.getId());
			}

		}
		mytProductApply.setOptId(currentUserId);
		mytProductApply.setId(id);
		try {
			service.update(mytProductApply);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductApply);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytProductApply mytProductApply = new MytProductApply();
		mytProductApply.setId(id);
		mytProductApply.setOptId(currentUserId);
		try {
			service.delete(mytProductApply);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductApply);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytProductApply mytProductApply = service.getById(id);

		if (mytProductApply == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytProductApply);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public Map<String, Object> getByPage(HttpServletRequest request) {
		Map<String, Object> params = getParameterMap(request);
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(service.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(service.getByPage(pageNumber, pageSize,
				params));

	}
}
