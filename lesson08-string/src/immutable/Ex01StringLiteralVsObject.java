package immutable;

public class Ex01StringLiteralVsObject {
	public static void main(String[] args) {
		//immutable cannot change about valid at HEAP
		//object is always created one memory area
		//literal can create one memory area if it is not created.
		//immutable --> literal(HEAP - constant pool) & object(HEAP)
		String l1 = "Hello";
		String l2 = "Xin chao";
		String l3 = "Hello";
		
		//immutable: when you assign variable for literal, it will point to new memory area.
		l1="welcome";
		hash("l1", l1);
		hash("l2", l2);
		hash("l3", l3);
		
		System.out.println("============");
		String o1 = new String("language");
		String o2 = new String("text");
		String o3 = new String("language");
		
		hash("o1", o1);
		hash("o2", o2);
		hash("o3", o3);	
	}
	
	private static void hash(String text, String prop) {
		System.out.println(text + " hash:"  + System.identityHashCode(prop));
	}
}
