package singleton;

public class SingletonDemo {
	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		System.out.println("s1 heap: " + System.identityHashCode(s1));
		s1.setTestValue("Regression");
		
		
		SingletonClass s2 = SingletonClass.getInstance();
		System.out.println("s2 heap: " + System.identityHashCode(s2));
		System.out.println("s2 --> " + s2.getTestValue());
	}
}
