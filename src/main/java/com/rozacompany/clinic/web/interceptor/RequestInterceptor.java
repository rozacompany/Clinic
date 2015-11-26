package com.rozacompany.clinic.web.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestInterceptor extends HandlerInterceptorAdapter {

//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		String uri = request.getRequestURI();
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		
//		if(authentication != null && !(authentication instanceof AnonymousAuthenticationToken) && !uri.contains("index.html")) {
//			try {
//				response.sendRedirect("/index.html");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return true;
//	}

}
