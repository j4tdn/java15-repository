package com.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RoleDao;
import com.dao.UserDao;
import com.entity.Role;
import com.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	@Transactional
	public User findUserByUserName(String username) {
		return userDao.findUserByUserName(username);
	}

	@Override
	@Transactional
	public void save(User user) {
		// encode user's password using BCrypt algorithm
		String password = user.getPassword();
		user.setPassword(passwordEncoder.encode(password));

		// set user's default roles
		Role adminRole = roleDao.findRoleByRoleName(Role.EMPLOYEE);
		user.setRoles(Arrays.asList(adminRole));

		// save
		userDao.save(user);
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		System.out.println("\n  Verify login feature and replace with JdbcDaoImpl#loadUserByUsername");
		User user = userDao.findUserByUserName(name);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password");
		}

		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				mapToAuthorities(user.getRoles()));
	}

	private Collection<? extends GrantedAuthority> mapToAuthorities(List<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}

}
