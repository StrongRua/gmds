/*
 * SecurityInterceptor.java
 * Copyright(C) 2013-2016 JackyYang Personal
 * All rights reserved.
 * -----------------------------------------------
 * 2015年5月26日 Created
 */
package com.rua.web.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rua.util.Global;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 安全访问拦截器【Session过期，非法访问】
 * 
 * @author Jacky
 * @version v1.0
 * @date 2015年5月26日
 * 
 */
public class SecurityInterceptor implements HandlerInterceptor
{
	private final static Log	LOG	= LogFactory
											.getLog(SecurityInterceptor.class);

	private List<String>		excludes;

	public void setExcludes(List<String> excludes)
	{
		this.excludes = excludes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax
	 * .servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception
	{

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception
	{

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet
	 * .http.HttpServletRequest, javax.servlet.http.HttpServletResponse,
	 * java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception
	{

		String requestURI = request.getRequestURI();
		for (String uri : excludes)
		{
			if (requestURI.endsWith(uri))
			{
				return true;
			}
		}

		HttpSession session = request.getSession();
		if (session.getAttribute(Global.SESSION_KEY_USER) == null)
		{
			LOG.info("session 不存在或过期");
			// AJAX 请求
			if (request.getHeader("x-requested-with") != null
					&& request.getHeader("x-requested-with").equalsIgnoreCase(
							"XMLHttpRequest"))
			{
				LOG.info("session 不存在或过期  AJAX");
				// response.addHeader("sessionstatus", "timeOut");
				// response.addHeader("url", "/");
				response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			} else
			{
				LOG.info("session 不存在或过期 普通请求");
				request.getRequestDispatcher("/").forward(request, response);
			}
			return false;
		}
		return true;
	}

}
