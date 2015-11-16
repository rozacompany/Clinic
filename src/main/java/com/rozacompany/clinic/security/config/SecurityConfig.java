/**
 * 
 */
package com.rozacompany.clinic.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.rozacompany.clinic.security.LoginFailureHandler;
import com.rozacompany.clinic.security.LoginSuccessHandler;
import com.rozacompany.clinic.security.RestAuthenticationEntryPoint;
import com.rozacompany.clinic.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserService userService;

	@Autowired
	RestAuthenticationEntryPoint authenticationEntryPoint;

	@Autowired
	LoginSuccessHandler successHandler;

	@Autowired
	LoginFailureHandler failureHandler;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		authenticationProvider.setUserDetailsService(userService);
		authenticationProvider.setPasswordEncoder(passwordEncoder);
		auth.authenticationProvider(authenticationProvider);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and()
				.authorizeRequests()
				.antMatchers("/login.html", "/ur/**", "/build/development/ur/**", "/ext/**", "/login").permitAll()
				.anyRequest().authenticated().and().formLogin().successHandler(successHandler)
				.failureHandler(failureHandler);
	}
}
