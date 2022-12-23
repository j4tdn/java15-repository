package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DbConnection {
	private static Connection connection = null;
	
	public static void main(String[] args) {
		System.out.println("-----> " + getConnection());
	}
	
	public static Connection getConnection() {
		if(connection == null) {
			Properties props = DbProvider.getProps();
			
			//connection database
			try {
				//Class.forName("com.mysql.cj.jdbc.Driver");
				//connection = DriverManager.getConnection(
					//	"jdbc:mysql://localhost:3306/java15_shopping",
					//	"root", 
					//	"tothingochuyen");
				
				Class.forName(props.getProperty(DbConTants.DRIVER));
				connection = DriverManager.getConnection(
						props.getProperty(DbConTants.URL), 
						props.getProperty(DbConTants.USER), 
						props.getProperty(DbConTants.PASS));
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
