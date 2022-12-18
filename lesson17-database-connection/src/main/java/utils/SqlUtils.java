package utils;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {
	public SqlUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static void close(AutoCloseable ...closeables) {
		for(AutoCloseable closeable: closeables) {
			if(closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static String md5(String password) {
		Objects.requireNonNull(password, "password cannot be null");
		System.out.println(password + " --> " + DigestUtils.md5Hex(password));
		return DigestUtils.md5Hex(password);
	}
}
