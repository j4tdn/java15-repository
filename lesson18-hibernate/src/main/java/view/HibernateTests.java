package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateConfiguration;

public class HibernateTests {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		System.out.println("sessionFactory --> " + sessionFactory);
		
		Session s1 = sessionFactory.openSession();
		Session s2 = sessionFactory.openSession();
		
		System.out.println("s1 --> " + s1);
		System.out.println("s2 --> " + s2);
		
		Session s3 = sessionFactory.getCurrentSession();
		Session s4 = sessionFactory.getCurrentSession();
		
		System.out.println("s3 --> " + s3);
		System.out.println("s4 --> " + s4);
	}
}
