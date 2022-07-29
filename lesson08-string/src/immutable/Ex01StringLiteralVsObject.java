package immutable;

public class Ex01StringLiteralVsObject {
	public static void main(String[] args) {
		//immutable --> literal & object
		String l1 = "Hello";
		String l2 = "Xin chào";
		String l3 = "Hello";
		//3 ô nhớ ở STACK, 2 ô nhớ ở HEAP
		
		l1 = "Welcome";
		
		hash("l1 hash", l1); //h1
		hash("l2 hash", l2); //h2
		hash("l3 hash", l3); //h1
		
		System.out.println("=========================");
		String o1 = new String("language");
		String o2 = new String("text");
		String o3 = new String("language");
		
		hash("o1 hash", o1); //h11
		hash("o2 hash", o2); //h22
		hash("o3 hash", o3); //h33
	}
	
	private static void hash(String text, String prop) {
		System.out.println(text + ": " + System.identityHashCode(prop));
	}
	
	
}
