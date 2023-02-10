package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import connection.HibernateConfiguration;

public class HibernateTests {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactoryAsJava();
		System.out.println("sessionoFactory-->" + sessionFactory);
		
		Session s1 =  sessionFactory.openSession();
		Session s2 =  sessionFactory.openSession();
		
		System.out.println("s1-->" + s1);
	}
}
