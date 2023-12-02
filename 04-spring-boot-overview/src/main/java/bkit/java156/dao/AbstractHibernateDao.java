package bkit.java156.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityManager;

public class AbstractHibernateDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private EntityManager entityManager;
	
	AbstractHibernateDao() {
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	Session getJpaCurrentSession(){
		return entityManager.unwrap(Session.class);
	}
	
}
