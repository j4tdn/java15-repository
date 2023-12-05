package bkit.java156.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bkit.java156.entity.User;

@Repository
public class HibernateUserDao implements UserDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static final String Q_FIND_USER_BY_USERNAME = "SELECT u FROM User u WHERE u.username = :username";
	
	@Override
	public User findUserByUserName(String username) {
		Session session = sessionFactory.getCurrentSession();
		try {
			return session.createQuery(Q_FIND_USER_BY_USERNAME, User.class)
					   .setParameter("username", username)
					   .getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("=====> No entity found for username " + username);
			return null;
		}
	}
	
}
