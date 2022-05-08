package structure;

public class Ex13 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "Welcome";
		String s3 = "hello";
		System.out.println(System.identityHashCode(s1) + " " + System.identityHashCode(s3));
		
		String o1 = new String("hello");
		String o2 = new String("welcome");
	}
}
