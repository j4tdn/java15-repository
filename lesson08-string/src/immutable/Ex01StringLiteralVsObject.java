package immutable;

public class Ex01StringLiteralVsObject {
	public static void main(String[] args) {
		// immutable --> literal && object
		String l1 = "Hello";
		String l2 = "Xin chao";
		String l3 = "Hello";
		hash("l1 hash", l1); // H1
		hash("l2 hash", l2); // H2
		hash("l3 hash", l3); // H3
		l1 = "Welcome"; // H4

		System.out.println("=============================================");
		String o1 = new String("language");
		String o2 = new String("object2");
		String o3 = new String("language");
		hash("o1 hash", o1);
		hash("o2 hash", o2);
		hash("o3 hash", o3);
	}

	private static void hash(String text, String prop) {
		System.out.println(text + ":" + System.identityHashCode(prop));
	}
}
