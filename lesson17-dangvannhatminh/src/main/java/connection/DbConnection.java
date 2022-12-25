package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection connection = null;
	public static void main(String[] args) {
		System.out.println("----->" + getConnection());
	}
	
	public static Connection getConnection()
	{
		if( connection == null) {
			Properties props = DbProvider.getProps();
			try {
				Class.forName(props.getProperty(DbConstants.DRIVER));
				connection = DriverManager.getConnection(
						props.getProperty(DbConstants.URL), 
						props.getProperty(DbConstants.USER), 
						props.getProperty(DbConstants.PASS));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
		}
		return connection;
	}
}
