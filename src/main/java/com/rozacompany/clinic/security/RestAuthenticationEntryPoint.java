package com.rozacompany.clinic.security;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class RestAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {

	public RestAuthenticationEntryPoint() {		
		this("/login.html");
	}
	
	public RestAuthenticationEntryPoint(String loginFormUrl) {
		super(loginFormUrl);
	}

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		if (isAjaxRequest(request)) {
			HttpServletResponseWrapper responseWrapper = new HttpServletResponseWrapper(response);
			Writer out = responseWrapper.getWriter();
			out.write("{success: false, message: \"Session expired\"}");
			out.flush();
	        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
	   } else {
	       super.commence(request, response, exception);
	   }
	}
	
	private boolean isAjaxRequest(HttpServletRequest request) {
		String requestHeader = request.getHeader("X-Requested-With");
		return "XMLHttpRequest".equals(requestHeader);
	}

}
