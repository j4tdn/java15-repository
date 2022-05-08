package structure;

public class Ex13 {
	public static void main(String[] args) {
		 Integer a = 5;
		 System.out.println("a1 hash : " + System.identityHashCode(a));
		 a = 15;
		 System.out.println("a2 hash :" + System.identityHashCode(a));
		 
	}
}
