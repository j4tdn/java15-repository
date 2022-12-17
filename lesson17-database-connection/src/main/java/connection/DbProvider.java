package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DbProvider {
	
	private DbProvider() {
	}
	
	public static Properties getProps() {
		Properties props = new Properties();
		try {
			File file = new File(DbContants.APPLICATION_PROPERTIES);
			props.load(new FileInputStream(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
	
}
