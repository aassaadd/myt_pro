package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.zhc.WeiXinApi.common.WebPay;
import com.zhc.myt.MytDao.entity.MytOrders;
import com.zhc.myt.MytDao.entity.MytUser;
import com.zhc.myt.MytDao.entity.MytWxUser;
import com.zhc.myt.MytService.MytOrdersService;
import com.zhc.myt.MytService.MytUserService;
import com.zhc.myt.MytService.MytWxUserService;
import com.zhc.myt.MytWxRestful.common.MytSystem;

@RestController
@RequestMapping(value = "/api/manage/mytOrders")
public class MytOrdersController extends BaseController {

	@Autowired
	private MytOrdersService service;
	@Autowired
	private MytWxUserService mytWxUserService;

	public MytOrdersController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public Map<String, Object> add(@RequestBody MytOrders mytOrders) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		mytOrders.setCreateId(currentUserId);
		mytOrders.setOptId(currentUserId);
		try {
			service.add(mytOrders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Map<String, Object> update(@PathVariable(value = "id") Integer id,
			@RequestBody MytOrders mytOrders,
			@RequestParam(value = "method", required = false) String method,
			HttpServletRequest request) {
		try {
			Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
			if (method != null && method.equals("pay")) {
				MytOrders orders = service.getById(mytOrders.getId());
				MytWxUser user = mytWxUserService.getById(currentUserId);
				// 下微信订单
				Map<String, Object> map = WebPay.unifiedorder(orders.getProName(), user
						.getOpenid(), "", orders.getOrderRealityFee()
						.intValue(), getRemoteAddrIp(request));
				if(!map.containsKey("return_code") || !map.get("return_code").equals("SUCCESS")){
					return getReturnMapFailure("微信订单支付创建失败");
				}
				mytOrders.setOrderNo(((Map<String,String>)map.get("signParams")).get("out_trade_no"));
				mytOrders.setOrderSequenceNo(map.get("prepay_id").toString());//微信成功后返回
				mytOrders.setOrderStatus("0");//预订单
			}
			mytOrders.setOptId(currentUserId);
			mytOrders.setId(id);
			service.update(mytOrders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public Map<String, Object> delete(@PathVariable(value = "id") Integer id) {
		Integer currentUserId = (Integer) MytSystem.getCurrentUserId();
		MytOrders mytOrders = new MytOrders();
		mytOrders.setId(id);
		mytOrders.setOptId(currentUserId);
		try {
			service.delete(mytOrders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> getById(@PathVariable(value = "id") Integer id) {
		MytOrders mytOrders = service.getById(id);

		if (mytOrders == null) {
			return getReturnMapFailure();
		}
		return getReturnMapSuccess(mytOrders);

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

	public static String getRemoteAddrIp(HttpServletRequest request) {
		// proxy_set_header X-Real-IP $remote_addr;

		String ipFromNginx = getHeader(request, "X-Real-IP");
		System.out.println("ipFromNginx:" + ipFromNginx);
		System.out.println("getRemoteAddr:" + request.getRemoteAddr());
		return StringUtils.isEmpty(ipFromNginx) ? request.getRemoteAddr()
				: ipFromNginx;
	}

	private static String getHeader(HttpServletRequest request, String headName) {
		String value = request.getHeader(headName);
		return !StringUtils.isBlank(value)
				&& !"unknown".equalsIgnoreCase(value) ? value : "";
	}
}
