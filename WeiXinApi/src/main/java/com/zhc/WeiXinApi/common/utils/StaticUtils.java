package com.zhc.WeiXinApi.common.utils;

import com.zhc.WeiXinApi.common.WeiXinApiSystem;

public class StaticUtils {

	public final static String SPBILL_CREATE_IP = "127.0.0.1";
	public final static String APPID = WeiXinApiSystem.getConfig("sys_appid");//sys_appid
	public final static String APPSECRET = WeiXinApiSystem.getConfig("sys_appsecret");//sys_appsecret
	public final static String MCH_ID = WeiXinApiSystem.getConfig("sys_mch_id");//sys_mch_id
	public final static String URL = WeiXinApiSystem.getConfig("we_unifiedorder");//支付接口
	public final static String ORDERQUERYURL = WeiXinApiSystem.getConfig("wx_orderquery");//订单查询接口
	public final static String ORDERREFUNDURL = WeiXinApiSystem.getConfig("wx_refund");//退款接口
	public final static String ORDERREFUNDQUERYURL = WeiXinApiSystem.getConfig("wx_refundquery");//退款查询接口
	public final static String MICROPAYURL = WeiXinApiSystem.getConfig("wx_micropay");//被扫订单接口
	public final static String CLOSEORDERURL = WeiXinApiSystem.getConfig("wx_closeorder");//关闭订单接口
	public final static String ACCESS_TOKENURL = WeiXinApiSystem.getConfig("wx_access_tokenurl");
	public final static String SHORTURL = WeiXinApiSystem.getConfig("wx_shorturl");//长链接转短链接
	public final static String NOTIFY_URL = WeiXinApiSystem.getConfig("wx_notify_url");//回调地址
	public final static String KEY = WeiXinApiSystem.getConfig("sys_key");//sys_key
	public final static String APICLIENT_CERT = WeiXinApiSystem.getConfig("wx_apiclient_cert");//wx_apiclient_cert证书地址
	public final static String TOKEN_URL=WeiXinApiSystem.getConfig("wx_token_url");//获得token
	
	public final static String FAIL = "FAIL";
	public final static String FAILD = "FAILD";
	public final static String SUCCESS = "SUCCESS";
	public final static String NOTPAY = "NOTPAY";
	public final static String REFUND = "REFUND";
	public final static String PROCESSING = "PROCESSING";
	public final static String NOTSURE = "NOTSURE";
	public final static String CHANGE = "CHANGE";
	public final static String MD5 = "MD5";
	public final static String JSAPI = "JSAPI";
	public final static String NATIVE = "NATIVE";
	public final static String APP = "APP";
	public final static String USERPAYING = "USERPAYING";
	public final static String CLOSED = "CLOSED";

}
