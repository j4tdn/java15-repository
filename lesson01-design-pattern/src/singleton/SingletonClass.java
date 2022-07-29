package singleton;
/*
 * Class which allowed to create ONE unique object //tạo duy nhất 1 đối tượng
 * 
 * Utility class which does not allow to create any object
 * */
public class SingletonClass {

		private static SingletonClass INSTANCE = null;
		
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
