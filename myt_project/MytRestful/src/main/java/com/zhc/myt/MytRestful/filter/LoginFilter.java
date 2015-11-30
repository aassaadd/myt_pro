package com.zhc.myt.MytRestful.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import net.sf.ehcache.Cache;

import org.apache.commons.lang.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhc.myt.MytRestful.common.MytSystem;
import com.zhc.myt.MytCommon.ErrorResult;
import com.zhc.myt.MytCommon.util.EhcacheUtil;

/**
 * 登录验证过滤器
 * @author bm_zhc
 *
 */
public class LoginFilter implements Filter{
	private FilterConfig filterConfig;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		Cache service=(Cache) EhcacheUtil.getCache("tokenCache");
		String token = req.getHeader("token");
		if (StringUtils.isEmpty(token)){
			token = req.getParameter("token");
		}
		if (StringUtils.isEmpty(token) || service.get(MytSystem.SYS_CACHE_PREFIX + token) == null) {
			ObjectMapper objectMapper = new ObjectMapper();
			// 校验失败.
			response.setContentType("text/html");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().print(objectMapper.writeValueAsString(new ErrorResult("101").setMsg("未登录")));
			return;
		}
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
	}

}
