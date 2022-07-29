package immutable;

public class Ex03Test {
	public static void main(String[] args) {
		// == equals ==> primitive object

		String s1 = "Hello";
		String s2 = "Bye";
		String s3 = "Hello";

		String o1 = new String("Welcome");
		String o2 = new String("Enjoy");
		String o3 = new String("Welcome");

		String o4 = new String("Bye");

		System.out.println("s1 == s2: " + (s1 == s2)); // F
		System.out.println("s1 == s3: " + (s1 == s3)); // T
		System.out.println("s1 eq s2: " + s1.equals(o2)); // F

		System.out.println("o1 == o2: " + (o1 == o2));
		System.out.println("o1 == o3: " + (o1 == o3));
		System.out.println("o1 eq o2: " + o1.equals(o3));
		
		
		System.out.println("===============================");
		
		String text01 = "cabbc23";
		String text02 = "a2";
		
		System.out.println("Compare: " + text01.compareTo(text02));
	}
}
