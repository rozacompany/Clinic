package com.rozacompany.clinic.web.controller;

import org.springframework.stereotype.Controller;

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
