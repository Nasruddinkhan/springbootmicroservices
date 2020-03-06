 /**
 * 
 */
 package com.mypractice.microservices.netflixzuulapigetwayserver;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author Nasruddin Khan 
 * 26-Sep-2019 - 12:59:37 am
 * ZuulLogingFilter.java
 */
@Component
public class ZuulLogingFilter extends ZuulFilter {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run()  {
		// TODO Auto-generated method stub
		HttpServletRequest request =	RequestContext.getCurrentContext().getRequest();
		log.info("request ->{} request uri ->{}",request, request.getRequestURI());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}

 
