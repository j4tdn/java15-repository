package view;

import connection.HibernateConfiguration;

public class HibernateTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();
		
	}
}
