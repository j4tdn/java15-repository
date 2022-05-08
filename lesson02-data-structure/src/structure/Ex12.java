package structure;

public class Ex12 {
	public static void main(String[] args) {
		Integer a = 5;
		System.out.println("a1 hash: " + System.identityHashCode(a));
		a = 15;
		System.out.println("a2 hash: " + System.identityHashCode(a));
		System.out.println("a value: " + a);
		
		String s1 = "hello";
		String s2 = "Welcom";
		String s3 = "hello";
		
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));

		String s11 = new String("hello");
		String s21 = new String("Welcom");
		String s31 = new String("hello");
		
		System.out.println("s1 hash: " + System.identityHashCode(s11));
		System.out.println("s2 hash: " + System.identityHashCode(s21));
		System.out.println("s3 hash: " + System.identityHashCode(s31));
	}
}
