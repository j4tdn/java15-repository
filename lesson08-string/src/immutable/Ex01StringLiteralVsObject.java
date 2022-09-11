package immutable;

public class Ex01StringLiteralVsObject {
	public static void main(String[] args) {
		//immuntable: bat bien --> ko the cap nhat gia tri cua o nho HEAP
		//immutable --> literal(HEAP(CONSTANT POOL)) & object
		String l1= "Hello";
		String l2= " xin chao";
		String l3= "Hello";
		
		l1 = "welcome";
		
		hash("l1 hash", l1);
		hash("l2 hash", l2);
		hash("l3 hash", l3);
		
		System.out.println("===================================");
		
		String o1 = new String("languege");
		String o2 = new String("text");
		String o3 = new String("languege");
		
		hash("o1 hash", o1);
		hash("o2 hash", o2);
		hash("o3 hash", o3);
	}
	private static void hash(String text, String prop) {
		System.out.println(text+ " : " + System.identityHashCode(prop));
	}
}
