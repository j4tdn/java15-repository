package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection connection = null;
	public static void main(String[] args) {
		System.out.println("------> " + getConnection());
	}
	public static Connection getConnection() {
		if(connection == null) {
			Properties props = DbProvider.getProps();
			try {
				Class.forName(props.getProperty(Dbcontants.DRIVER));
				connection = DriverManager.getConnection(
						props.getProperty(Dbcontants.URL), 
						props.getProperty(Dbcontants.USER),
						props.getProperty(Dbcontants.PASS));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
