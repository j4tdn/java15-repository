package bkit.java156.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import bkit.java156.service.UserServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.antMatchers("/static/**").permitAll()
				.antMatchers("/leaders/**").hasRole("MANAGER")
				.antMatchers("/system/**").hasRole("ADMIN")
				.anyRequest()
				.authenticated()
			.and()
			.formLogin()
				.loginPage("/login") // need to create @GetMapping(/login) - return jsp page for login
				.loginProcessingUrl("/login") // authenticate automatically by spring security
				.failureUrl("/login?failed")
				.permitAll()
			.and()
			.logout()
				.logoutUrl("/logout") // @PostMapping(/logout) - process logout by spring security
				//.logoutSuccessUrl("/hello") // logout successful - return /hello page (default /login)
				.permitAll()
			.and()
				.exceptionHandling()
				.accessDeniedPage("/403");
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
		authenticationProvider.setUserDetailsService(userDetailsService());
		authenticationProvider.setPasswordEncoder(passwordEncoder());
		return authenticationProvider;
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		return new UserServiceImpl();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
