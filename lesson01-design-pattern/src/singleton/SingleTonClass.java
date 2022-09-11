package singleton;

import javax.management.InstanceAlreadyExistsException;

/*
 * Singleton Class which allowed to create ONE unique object
 * 
 * 
 * Utility class whichdoes not alloew to create any object
 * 
 * */
public class SingleTonClass {
	private static SingleTonClass INSTANCE = null;
	private String testValue;
	private SingleTonClass() {
		
	}
	public static SingleTonClass getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new SingleTonClass();
		}
		return INSTANCE;
	}
}
