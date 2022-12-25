package utils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SqlUtils {
	private SqlUtils() {
	}

	public static void close(AutoCloseable... closeables) {
		try {
			for (AutoCloseable closeable : closeables) {
				if (closeable != null) {
					closeable.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static <Element> void print(List<Element> elements) {
		for(Element element : elements) {
			System.out.println(element);
		}
	}
	
	public static <Element> void print(String prefix, Element elements) {
		System.out.println(prefix + " >>> " + elements);
	}

	public static int getGeneratedKey(PreparedStatement pst) throws SQLException {
		int generatedKey = -1;
		ResultSet rs =  pst.getGeneratedKeys();

		if(rs.next()) {
			generatedKey =  rs.getInt(1);
		}
		return generatedKey;
	}
}