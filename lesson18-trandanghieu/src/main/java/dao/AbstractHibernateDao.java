package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import provider.HibernateProvider;

import org.hibernate.query.Query;
import java.util.List;

public class AbstractHibernateDao {
	private SessionFactory factory;

	AbstractHibernateDao() {
		factory = HibernateProvider.getSessionFactory();
	}

	// Always create new session
	Session openSession() {
		return factory.openSession();
	}

	// Only create one unique thread
	Session getCurrentSession() {
		return factory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> safeList(Query<?> query) {
		return (List<T>) query.getResultList();
	}
}
