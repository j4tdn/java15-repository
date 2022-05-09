package structure;

public class Ex13 {
	public static void main (String[] args) {
		
		// Immutable class
		Integer a = 5; // H10(value=5)
		System.out.println("a1 hash: " + System.identityHashCode(a));
		a = 15; //H11(value=15)
		System.out.println("a value: " + System.identityHashCode(a));
		System.out.println("a value: " + a);
		
		//HEAP -> constant pool memory
		String s1 = "hello"; //H1
		String s2 = "Welcome"; //H2
		String s3 = "hello"; //H1
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		
		
		//HEAP -> normal memory
		String o1 = "hello"; //H3
		String o2 = "Welcome"; //H4
		String o3 = "hello"; //H3
		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("o3 hash: " + System.identityHashCode(o3));
		

		
	}

}
