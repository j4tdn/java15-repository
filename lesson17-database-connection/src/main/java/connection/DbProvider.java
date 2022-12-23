package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	private static final String APPLICATION_PROPERTIES = "application.properties";
	private DbProvider() {
		
	}
	
	public static Properties getProps() {
		Properties props = new Properties();
		try {
			InputStream is = new FileInputStream(new File(DbConTants.APPLICATION_PROPERTIES));
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}
}
