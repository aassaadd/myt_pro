package com.zhc.myt.MytCommon.util;

import java.lang.reflect.Method;
import java.util.Map;

public class ExampleUtils {

	/**
	 * 讲Map的查询条件转成Example的查询（未完善）
	 */
	public static <K> K Map2ExampleMethod(K cr, Map<String, Object> params) {
		Map<String, Class<?>[]> ret = BeanUtils
				.getBeanMethodsParameterTypes(cr);
		for (String key : params.keySet()) {
			if (!params.get(key).toString().trim().equals("")) {//如果不为空
				String methodName = "and" + key.toUpperCase().charAt(0)
						+ key.substring(1) + "EqualTo";
				if (ret.containsKey(methodName)) {
					try {
						Method method = cr.getClass().getMethod(methodName,
								ret.get(methodName));
						method.invoke(cr, params.get(key));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}

		}
		return cr;

	}

}
