package dao;

import java.util.List;
import java.util.function.Consumer;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import connection.*;

public class AbstractHibernateDao {
	private SessionFactory factory;
	
	public AbstractHibernateDao() {
		factory = HibernateConfiguration.getSessionFactory();
	}
	
	// Option 1: Using openSession >> thread
	// Always create new thread, new session
	Session openSession() {
		return factory.openSession();
	}
	
	// Option2: Using getCurrentSession >> thread
	//			Only create ONE unique session
	Session getCurrentSession() {
		return factory.getCurrentSession();
	}
	void executeInTransaction(Consumer<Session> consumer) {
		Session session= openSession();
		Transaction transaction = session.beginTransaction();
		try {
			consumer.accept(session);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
	@SuppressWarnings("unchecked")
	public <T> List<T> safeList(Query<?> query){
		return (List<T>) query.getResultList();
	}
}