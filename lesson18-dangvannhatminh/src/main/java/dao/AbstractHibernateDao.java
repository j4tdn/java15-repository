package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import connection.HibernateProvider;

public class AbstractHibernateDao {
	static SessionFactory sessionFactory;
	
	AbstractHibernateDao() {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	Session openSession()
	{ 
		return sessionFactory.openSession();
	}
	Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	public <T> List<T> safeList(Query<?> query)
	{
		return (List<T>) query.getResultList();
	}
}
