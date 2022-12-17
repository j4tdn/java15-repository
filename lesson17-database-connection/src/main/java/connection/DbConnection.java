package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection connection = null;
	
	public static Connection getConnection() {
		if (connection == null) {
			Properties props = DbProvider.getProps();
			try {
				Class.forName(props.getProperty(DbContants.DRIVER));
				connection = DriverManager.getConnection(
						props.getProperty(DbContants.URL), 
						props.getProperty(DbContants.USER), 
						props.getProperty(DbContants.PASS));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
