package utils;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {
	public SqlUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void close(AutoCloseable... autoCloseables) {
		for (AutoCloseable autoCloseable : autoCloseables) {
			if (autoCloseable != null) {
				try {
					autoCloseable.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String md5(String password) {
		Objects.requireNonNull(password,"password can not be null");
		return DigestUtils.md5Hex(password);
	}
}
