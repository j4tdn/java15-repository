package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import connection.HibernateConnection;

public class AbstractHibernateDao {
	static SessionFactory sessionFactory;
	
	AbstractHibernateDao() {
		sessionFactory = HibernateConnection.getSession();
	}
	Session getOpenSession() {
		return sessionFactory.openSession();
	}
	 @SuppressWarnings("unchecked")
		<T> List<T> safeList(Query<?> query) {
			 return  (List<T>) query.getResultList();
		 }
}
