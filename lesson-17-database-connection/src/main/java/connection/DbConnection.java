package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DbConnection {
private static Connection connection = null;
public static void main(String[] args) {
	System.out.println("----->" +getConnection());
}



public static Connection getConnection() {
	if(connection ==null) {
	//connect database
		Properties properties = DbProvider.getProps();
		
    try {
		Class.forName(properties.getProperty(DbContants.DRIVER));
	connection = DriverManager.getConnection(
				properties.getProperty(DbContants.URL), 
				properties.getProperty(DbContants.USER), 
				properties.getProperty(DbContants.PASS));
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
 return connection;
}
}
