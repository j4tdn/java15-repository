package structure;

public class Ex13 {
	public static void main(String[] args) {
		//Immutable class
		Integer a = 5;
		System.out.println("a1 hash: " + System.identityHashCode(a));
		a = 15;
		System.out.println("a2 hash: " + System.identityHashCode(a));
		System.out.println("a value: " + a);
		System.out.println();
		
		//HEAP --> constant pool memory
		String s1 = "hello"; //ex: địa chỉ nhớ HEAP H1
		String s2 = "welcome"; //ex: H2
		String s3 = "hello"; //ex: H1
		System.out.println("s1 hash: " + System.identityHashCode(s1));
		System.out.println("s2 hash: " + System.identityHashCode(s2));
		System.out.println("s3 hash: " + System.identityHashCode(s3));
		System.out.println();
		
		//HEAP --> normal memory: tốn ô nhớ của HEAP
		String o1 = new String("hello"); //H1
		String o2 = new String("welcome"); //H2
		String o3 = new String("hello"); //H3
		System.out.println("o1 hash: " + System.identityHashCode(o1));
		System.out.println("o2 hash: " + System.identityHashCode(o2));
		System.out.println("03 hash: " + System.identityHashCode(o3));
	}
}
