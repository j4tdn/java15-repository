package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class DbConnection {
	private static Connection connection = null;

	public static void main(String[] args) {
		System.out.println("----->" + getConnection());
	}

	public static Connection getConnection() {
		if (connection == null) {
//			Properties props = DbProvider.getProps();
//			//connect db
//		//		Driver.class.getName();
//			try {
//				Class.forName(props.getProperty(DbContants.DRIVER));
//				connection = DriverManager.getConnection(props.getProperty(DbContants.URL), props.getProperty(DbContants.USERNAME), props.getProperty(DbContants.PASSWORD));
//			} catch (ClassNotFoundException | SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/java15_shopping_test", "root",
						"1234");
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return connection;
	}
}
