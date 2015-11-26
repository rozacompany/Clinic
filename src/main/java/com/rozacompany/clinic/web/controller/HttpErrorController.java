package com.rozacompany.clinic.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class HttpErrorController {
	
	@RequestMapping(value="/404")
    public String error404(HttpServletRequest request, HttpServletResponse response){
       return "redirect:/index.html";
    }
}