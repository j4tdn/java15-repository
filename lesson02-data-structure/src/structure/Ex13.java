package structure;

public class Ex13 {
	public static void main(String[] args) {

		// HEAP -> constant pool memory, nên dùng, ít tốn bộ nhớ
		String s1 = "hello";
		String s2 = "welcome";
		String s3 = "welcome";
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		s3="abc";
		System.out.println("s3 hash: " + System.identityHashCode(s3));

		// HEAP -> normal memory
		String o1 = new String("hello");
		String o2 = new String("welcome");
		String o3 = new String("welcome");

		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("o3 hash: " + System.identityHashCode(o3));

	}
}
