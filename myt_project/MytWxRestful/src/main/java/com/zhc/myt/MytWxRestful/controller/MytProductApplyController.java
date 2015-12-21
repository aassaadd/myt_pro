package com.zhc.myt.MytWxRestful.controller;

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
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytService.MytOrdersService;
import com.zhc.myt.MytService.MytProductApplyService;
import com.zhc.myt.MytService.MytProductService;
import com.zhc.myt.MytService.MytQuestionnaireService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytProductApply")
public class MytProductApplyController extends BaseController {

	@Autowired
	private MytProductApplyService service;

	@Autowired
	private MytQuestionnaireService mytQuestionnaireService;
	@Autowired
	private MytProductService mytProductService;

	@Autowired
	private MytOrdersService mytOrdersService;

	public MytProductApplyController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(@RequestBody MytProductApply mytProductApply) {
		MytUser user = new MytUser();
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		user.setOptId(currentUserId);
		if (mytProductApply.getWxUserId() == 0) {
			// 如果为0表示获取当前用户
			mytProductApply.setWxUserId(MytSystem.getCurrentUserId());
		}
		mytProductApply.setState("0");// 提交状态
		if (mytProductApply.getProId() != null) {
			// 判断是否需要审核
			MytProduct pro = mytProductService.getById(mytProductApply
					.getProId());
			if (pro.getProExamineType().equals("0")) {
				// 如果不需要审核申请
				mytProductApply.setState("1");// 审核通过
				// 并下单,这时候的订单只是做为记录使用，货品数量默认为1可以修改
				MytOrders orders = new MytOrders();
				orders.setMchId(pro.getMchId());
				orders.setWxUserId(mytProductApply.getWxUserId());
				orders.setOrderBody(pro.getProName());
				orders.setOrderGoodsNum(1);
				orders.setOrderTotalFee(pro.getProTryPrice());
				orders.setOrderRealityFee(pro.getProTryPrice());//申请支付金额
				orders.setProId(pro.getId());
				orders.setProName(pro.getProName());
				orders.setProOneFee(pro.getProTryPrice());
				orders.setProImgId(pro.getImgId());
				orders.setOrderStatus("S");//订单提交
				mytOrdersService.add(orders);
				mytProductApply.setOrderId(orders.getId());
			}
			//需要什么的通过pc端什么来判断流程
		}

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
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		Map<String, Object> params = getParameterMap(request);
		if (params.containsKey("wxUserId")
				&& params.get("wxUserId").toString().equals("0")) {
			params.replace("wxUserId", currentUserId);
		}
		
		if (!params.containsKey("page")) {
			return getReturnMapSuccess(service.getByList(params));
		}
		Integer pageNumber = Integer.parseInt((String) params.get("page"));
		Integer pageSize = Integer.parseInt((String) params.get("pageSize"));
		return getReturnMapSuccess(service.getByPage(pageNumber, pageSize,
				params));

	}
}
