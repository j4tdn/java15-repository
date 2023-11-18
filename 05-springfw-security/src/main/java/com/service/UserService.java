package com.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.entity.User;

public interface UserService extends UserDetailsService{
	User findUserByUserName(String username);

	void save(User user);
}
