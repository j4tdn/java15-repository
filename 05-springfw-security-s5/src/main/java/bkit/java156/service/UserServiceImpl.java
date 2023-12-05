package bkit.java156.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bkit.java156.dao.UserDao;
import bkit.java156.entity.Role;
import bkit.java156.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	// default method from Spring Security (UserDetailsService) --> to verify authenticate/authorize
	// create a customer by our database
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("Test >>> load user by username - 03.12.2023");
		User user = userDao.findUserByUserName(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password - Test Abc");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				mapToAuthorities(user.getRoles()));
		
	}
	
	private Collection<? extends GrantedAuthority> mapToAuthorities(List<Role> roles) {
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}
}
