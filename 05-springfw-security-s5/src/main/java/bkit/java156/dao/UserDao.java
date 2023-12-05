package bkit.java156.dao;

import bkit.java156.entity.User;

public interface UserDao {
	
	User findUserByUserName(String username);

}
