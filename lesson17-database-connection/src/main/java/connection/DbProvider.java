package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	
	
	private DbProvider() {
		
	}
	
	// Lưu dưới dạng <K, V> implements từ Map<K, V>
	public static Properties getProps() {
		Properties props = new Properties();
		InputStream is;
		try {
			is = new FileInputStream(new File(DbContants.APPLICATIONS_PROPERTIES));
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
	
	
}
