package immutable;

public class Ex01StringLiteralVsObject {
	public static void main(String[] args) {

		String l1 = "Hello";
		String l2 = "Xin chao";
		String l3 = "Hello";
		
		l1 = "Welcome";
		
		hash("l1 hash", l1);
		hash("l2 hash", l2);
		hash("l3 hash", l3);
		
		String o1 =  new String("language");
		String o2 =  new String("text");
		String o3 =  new String("language");

		hash("o1 hash", o1);
		hash("o2 hash", o2);
		hash("o3 hash", o3);
		
		
	}

	public static void hash(String text, String prop) {
		System.out.println(text + ": " + System.identityHashCode(prop));
	}

}
