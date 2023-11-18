package com.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.service.UserService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	// @Autowired
	// private DataSource dataSource;
	
	@Autowired
	private CustomAuthenticationSuccessHandler successHandler;
	
	@Autowired
	private UserService userService;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// Option1: Store accounts in memory
		// UserBuilder users = User.withDefaultPasswordEncoder();
		// auth.inMemoryAuthentication()
		//	.withUser(users.username("john").password("test123").roles("EMPLOYEE"))
		//	.withUser(users.username("mary").password("test123").roles("EMPLOYEE", "MANAGER"))
		//	.withUser(users.username("susan").password("test123").roles("EMPLOYEE", "ADMIN"));
		
		// Option 2: using default schema with jdbc and available query
		// from DaoAuthenticationProvider#retrieveUser
		// auth.jdbcAuthentication().dataSource(dataSource);
		
		// Option 3: using custom schema and override UserDetailService#loadUserByUserName
		auth.authenticationProvider(authenticationProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// csrf().disable()
		
		http.authorizeRequests()
		    	.antMatchers("/static/**").permitAll()
		    	.antMatchers("/user/register/**").permitAll()
		    	.antMatchers("/").hasRole("EMPLOYEE")
		    	.antMatchers("/leaders/**").hasRole("MANAGER")
		    	.antMatchers("/system/**").hasRole("ADMIN")
				.anyRequest()
				.authenticated()
			.and()
				.formLogin()
				.loginPage("/login") // default /login GET
				.loginProcessingUrl("/login") // default /login POST
				.successHandler(successHandler)
				.permitAll()
			.and()
				.logout().permitAll() // default /logout
			.and()
				.exceptionHandling()
				.accessDeniedPage("/403");
	}
	
	@Bean // define bean to encode password before saving
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	// UserDetailService, PasswordEncoder
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userService);
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}
	
}
