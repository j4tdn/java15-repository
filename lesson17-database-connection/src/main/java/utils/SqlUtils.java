package utils;

public class SqlUtils {
	private SqlUtils() {
		// TODO Auto-generated constructor stub
	}
	public static void close (AutoCloseable ...closeables)
	{
		for(AutoCloseable closeable : closeables)
		{
			if(closeable != null)
			{
				try {
					closeable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
