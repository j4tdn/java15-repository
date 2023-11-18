package com.dao;

import com.entity.User;

public interface UserDao {
	User findUserByUserName(String username);

	void save(User user);
}
