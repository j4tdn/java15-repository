package connection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	
	private DbProvider() {
	}
	
	// Properties là một class lưu trữ dưới dạng key value, con của Map
	public static Properties getProps()
	{
		Properties props = new Properties();
		InputStream is;
		try {
			is = new FileInputStream(new File(DbConstants.APPLICATION_PROPERTIES));
			props.load(is);
		} catch (IOException e) {
		}
		return props;
	}
}	
