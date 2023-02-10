package dao;

import java.util.List;
import java.util.function.Consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import connection.HibernateProvider;

public class AbstractHibernateDao {
	
	static SessionFactory sessionFactory;
	
	AbstractHibernateDao() {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	public Session openSession() {
		return sessionFactory.openSession();
	}
	
	public void closeSession() {
		sessionFactory.close();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	void executeInTransaction(Consumer<Session> consumer) {
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		try {
			consumer.accept(session);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}
	}
	
	public <T> List<T> safeList(Query<?> query){
		return (List<T>)query.getResultList();
	}
}
