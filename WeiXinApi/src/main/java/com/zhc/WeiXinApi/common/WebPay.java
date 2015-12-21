package com.zhc.WeiXinApi.common;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import com.zhc.WeiXinApi.common.utils.StaticUtils;
import com.zhc.myt.MytCommon.util.HttpRequestUtil;
import com.zhc.myt.MytCommon.util.OrdersUtils;
import com.zhc.myt.MytCommon.util.PayManageUtil;
import com.zhc.myt.MytCommon.util.XmlUtil;

public class WebPay {

	public WebPay() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 统一下单
	 * @param body :Ipad mini  16G  白色	商品或支付单简要描述
	 * @param openid:rade_type=JSAPI，此参数必传，用户在商户appid下的唯一标识。
	 * @param attach:附加数据，在查询API和支付通知中原样返回，该字段主要用于商户携带订单的自定义数据
	 * @param totalFee:订单总金额，单位为分
	 * @param ip:APP和网页支付提交用户端ip，Native支付填调用微信支付API的机器IP。
	 * @return：
	 * signParams:传入的值
	 * 具体查看微信:https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_1
	 * @throws Exception
	 */
	public static Map<String,Object> unifiedorder(String body,String openid,String attach,Integer totalFee,String ip) throws Exception {
		SortedMap<String,String> signParams=new TreeMap<String, String>();
		signParams.put("appid", StaticUtils.APPID);
		signParams.put("mch_id", StaticUtils.MCH_ID);
		signParams.put("nonce_str", PayManageUtil.createNoncestr(16));
		signParams.put("body", body);
		signParams.put("openid", openid);
		signParams.put("out_trade_no", OrdersUtils.getOrderNo());
		signParams.put("total_fee",String.valueOf(totalFee));
		if(ip==null){
			signParams.put("spbill_create_ip", StaticUtils.SPBILL_CREATE_IP);
		}else{
			signParams.put("spbill_create_ip", ip);
		}
		signParams.put("notify_url",StaticUtils.NOTIFY_URL);
		signParams.put("trade_type", StaticUtils.JSAPI);
		
		String sign;
		
		sign = PayManageUtil.createSign(signParams,StaticUtils.KEY);

		//增加非参与签名的额外参数
		signParams.put("sign", sign);
		
		
		String xml = XmlUtil.converter(signParams);
		String results = HttpRequestUtil.postXml(StaticUtils.URL, xml);
		Map<String, Object> result = XmlUtil.xmlStrToMap(results);
		result.put("signParams", signParams);
		return result;
	}
	/**
	 *  查询订单
	 * @param out_trade_no 商户订单号 
	 * @return
	 * signParams:传入的值
	 * 微信接口：https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_2
	 * @throws Exception
	 */
	public static Map<String,Object> orderquery(String out_trade_no) throws Exception {
		SortedMap<String,String> signParams=new TreeMap<String, String>();
		signParams.put("appid", StaticUtils.APPID);
		signParams.put("mch_id", StaticUtils.MCH_ID);
		signParams.put("nonce_str", PayManageUtil.createNoncestr(16));
		signParams.put("out_trade_no", out_trade_no);
		String sign;
		sign = PayManageUtil.createSign(signParams,StaticUtils.KEY);

		//增加非参与签名的额外参数
		signParams.put("sign", sign);
		
		
		String xml = XmlUtil.converter(signParams);
		String results = HttpRequestUtil.postXml(StaticUtils.ORDERQUERYURL, xml);
		Map<String, Object> result = XmlUtil.xmlStrToMap(results);
		result.put("signParams", signParams);
		return result;
	}
	/**
	 * 关闭订单 
	 * @param out_trade_no 商户订单号 
	 * @return
	 * signParams:传入的值
	 * 具体查看微信:https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_3
	 * @throws Exception
	 */
	public static Map<String,Object> closeorder(String out_trade_no) throws Exception {
		SortedMap<String,String> signParams=new TreeMap<String, String>();
		signParams.put("appid", StaticUtils.APPID);
		signParams.put("mch_id", StaticUtils.MCH_ID);
		signParams.put("nonce_str", PayManageUtil.createNoncestr(16));
		signParams.put("out_trade_no", out_trade_no);
		String sign;
		sign = PayManageUtil.createSign(signParams,StaticUtils.KEY);

		//增加非参与签名的额外参数
		signParams.put("sign", sign);
		
		
		String xml = XmlUtil.converter(signParams);
		String results = HttpRequestUtil.postXml(StaticUtils.CLOSEORDERURL, xml);
		Map<String, Object> result = XmlUtil.xmlStrToMap(results);
		result.put("signParams", signParams);
		return result;
	}
	/**
	 * 
	 * @param out_trade_no 订单商户号
	 * @param total_fee 订单金额
	 * @param refund_fee 退款金额
	 * @return
	 * 接口说明：https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_4
	 * signParams:传入的值
	 * @throws Exception
	 */
	public static Map<String,Object> refund(String out_trade_no,Integer total_fee,Integer refund_fee) throws Exception {
		
		SortedMap<String,String> signParams=new TreeMap<String, String>();
		signParams.put("appid", StaticUtils.APPID);
		signParams.put("mch_id", StaticUtils.MCH_ID);
		signParams.put("nonce_str", PayManageUtil.createNoncestr(16));
		signParams.put("out_trade_no", out_trade_no);
		signParams.put("out_refund_no", OrdersUtils.getRefundOrderNo());
		signParams.put("total_fee", String.valueOf(total_fee));
		signParams.put("refund_fee", String.valueOf(refund_fee));
		signParams.put("op_user_id", StaticUtils.MCH_ID);
		String sign;
		sign = PayManageUtil.createSign(signParams,StaticUtils.KEY);

		//增加非参与签名的额外参数
		signParams.put("sign", sign);
		
		
		String xml = XmlUtil.converter(signParams);
		String results = HttpRequestUtil.postSslXml(StaticUtils.ORDERREFUNDURL, "PKCS12", StaticUtils.APICLIENT_CERT, StaticUtils.MCH_ID, xml);
		Map<String, Object> result = XmlUtil.xmlStrToMap(results);
		result.put("signParams", signParams);
		return result;
	}
	
	/**
	 * 退款查询
	 * @param out_trade_no 订单号
	 * @return
	 * signParams:传入的值
	 * 接口说明：https://pay.weixin.qq.com/wiki/doc/api/jsapi.php?chapter=9_5
	 * @throws Exception
	 */
	public static Map<String,Object> refundquery(String out_trade_no) throws Exception {
		
		SortedMap<String,String> signParams=new TreeMap<String, String>();
		signParams.put("appid", StaticUtils.APPID);
		signParams.put("mch_id", StaticUtils.MCH_ID);
		signParams.put("nonce_str", PayManageUtil.createNoncestr(16));
		signParams.put("out_trade_no", out_trade_no);
		String sign;
		sign = PayManageUtil.createSign(signParams,StaticUtils.KEY);

		//增加非参与签名的额外参数
		signParams.put("sign", sign);
		
		
		String xml = XmlUtil.converter(signParams);
		String results = HttpRequestUtil.postXml(StaticUtils.ORDERREFUNDQUERYURL, xml);
		Map<String, Object> result = XmlUtil.xmlStrToMap(results);
		result.put("signParams", signParams);
		return result;
	}
}
