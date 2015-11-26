package com.rozacompany.clinic.security;

import org.springframework.security.core.context.SecurityContextHolder;

import com.rozacompany.clinic.entity.User;

public class Authentication {
	public static User getPrincipal() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return (User)principal;
	}
}
