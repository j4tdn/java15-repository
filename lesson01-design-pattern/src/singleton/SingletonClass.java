package singleton;

import java.security.KeyStore.PrivateKeyEntry;

/**
 * Singleton Class which allow to create ONE unique object
 * 
 * @author MSI GL65 Utility class which does not allow to create any objects
 */
public class SingletonClass {
	private  static SingletonClass INSTANCE = null;
	
	private String testValue;
	
	private SingletonClass() {
           
	}
	public static SingletonClass getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonClass();
		}
		return INSTANCE;
	}
	public String getTestValue() {
		return testValue;
	}
	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}
}
