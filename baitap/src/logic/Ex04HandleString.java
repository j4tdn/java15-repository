package logic;

public class Ex04HandleString {
	public static void main(String[] args) {
		String s = new String("hello");
		System.out.println(System.identityHashCode(s));
		s = "adhg";
		System.out.println(System.identityHashCode(s));
	}
}
