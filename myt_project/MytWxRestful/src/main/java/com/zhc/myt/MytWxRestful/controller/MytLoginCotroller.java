package com.zhc.myt.MytWxRestful.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zhc.myt.MytWxRestful.service.MytLoginService;
import com.zhc.myt.MytDao.entity.MytUser;

@RestController
@RequestMapping(value = "/api")
public class MytLoginCotroller extends BaseController {
	private static Logger LOGGER = LoggerFactory
			.getLogger(MytLoginCotroller.class);

	@Autowired
	private MytLoginService mytLoginService;


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public Map<String, Object> login(@RequestBody MytUser mytUser,
			HttpServletRequest request) {
		Map<String, Object> user = mytLoginService.login(mytUser.getUserName(),
				mytUser.getUserPassword());
		if (user != null) {
			
			return getReturnMapSuccess(user);
		}
		
		return getReturnMapFailure("登陆失败");
	}
	public static String getRemoteAddrIp(HttpServletRequest request) {
		//proxy_set_header  X-Real-IP  $remote_addr;

        String ipFromNginx = getHeader(request, "X-Real-IP");
        System.out.println("ipFromNginx:" + ipFromNginx);
        System.out.println("getRemoteAddr:" + request.getRemoteAddr());
        return StringUtils.isEmpty(ipFromNginx) ? request.getRemoteAddr() : ipFromNginx;
    }


    private static String getHeader(HttpServletRequest request, String headName) {
        String value = request.getHeader(headName);
        return !StringUtils.isBlank(value) && !"unknown".equalsIgnoreCase(value) ? value : "";
    }
}
