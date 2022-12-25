package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection connection = null;

	public static void main(String[] args) {
		System.out.println("------------>" + getConnection());
	}

	public static Connection getConnection() {
		if (connection == null) {
			// connect database
			Properties props = DbProvider.getProps();
			try {
				Class.forName(props.getProperty(DbConstant.DRIVER));
				connection = DriverManager.getConnection(props.getProperty(DbConstant.URL),
						props.getProperty(DbConstant.USER), props.getProperty(DbConstant.PASSWORD));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
