package connection;

public class HibernateConfiguration {
	
	private static SessionFactory sessionFactory;
	
	private HibernateConfiguration(){
	}
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
		}
		
		return sessionFactory;
	}
}
