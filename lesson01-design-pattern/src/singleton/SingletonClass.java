package singleton;
/*
 * singleton chỉ cho phép tạo ra duy nhất một đối tượng, tạo ra nhiều trùng dữ liệu thì tạo như không
 * Utillity là một class mà không cho phép tạo ra các đối tượng
 */
public class SingletonClass {
	private static SingletonClass INTANCE = null;
	private String testValue;
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance(String[] args) {
		if ( INTANCE == null) {
			INTANCE = new SingletonClass();
		}
		return INTANCE;
	}
	
	//public String get
	
}
