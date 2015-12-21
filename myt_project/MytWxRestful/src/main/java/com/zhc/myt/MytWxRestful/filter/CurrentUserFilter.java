package com.zhc.myt.MytWxRestful.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils;
import com.zhc.myt.MytCommon.util.EhcacheUtil;
import com.zhc.myt.MytWxRestful.common.MytSystem;

import net.sf.ehcache.Cache;

/**
 * 此过滤器用于将当前操作的用户保存到当前线程上下文. 用于当前线程的后续操作可以在不访问servlet
 * api的情况下可以获取到当前的操作人信息.
 * 
 * 注意: 此过滤器之前必须添加登录校验过滤器.
 * @author bm_zhc
 *
 */
public class CurrentUserFilter implements Filter{
	private FilterConfig filterConfig;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		Cache service=(Cache) EhcacheUtil.getCache("tokenCache");
		String token = req.getHeader("token");
		if(StringUtils.isEmpty(token)){
			token = req.getParameter("token");
		}
		if(StringUtils.isNotEmpty(token)){
			Integer currentUserId = (Integer) service.get(MytSystem.SYS_CACHE_PREFIX+token).getObjectValue();
			// 为当前线程设置当前操作用户.
			MytSystem.CURRENT_USER_ID_THREADLOCAL.set(currentUserId);
		}
		filterChain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
	}

}
