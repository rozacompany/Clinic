package com.rozacompany.clinic.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {	
	
//	@RequestMapping(value = { "{path:(?!login\\.html|index\\.html|ur|ext|build|cl).*$}", "{path:(?!login\\.html|index\\.html|ur|ext|build|cl).*$}/**" })
//	public void getView(HttpServletRequest request, HttpServletResponse response, @PathVariable(value = "path")String path) {
//		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//		
//		if(authentication != null && !(authentication instanceof AnonymousAuthenticationToken)) {
//			try {
//				response.sendRedirect("/index.html");
//			} catch (IOException e) {
//				e.printStackTrace();
//			}//"forward:/ur/index.html";
//		}
//    }
}
