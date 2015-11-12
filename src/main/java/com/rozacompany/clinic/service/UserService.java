/**
 * 
 */
package com.rozacompany.clinic.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.rozacompany.clinic.entity.User;

public interface UserService extends UserDetailsService
{
	User findByUsername(String username);
}

