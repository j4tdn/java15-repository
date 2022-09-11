package immutable;

public class Ex03Test {
	public static void main(String[] args) {
		//String == (address) equals(value) ==>primitive object
		String s1 = "Hello";
		String s2 = "Bye";
		String s3 = "Hello";
		
		String o1 = new String("welcome");
		String o2 = new String("enjoy");
		String o3 = new String("welcome");
		String o4 = new String("bye");
		
		System.out.println("s1 == s2" + (s1 == s2));
		System.out.println("s1 == s3" + (s1 == s3));
		System.out.println("s1 eq s2" + (s1.equals(s2)));
		
		System.out.println("o1 == o2" + (o1 == o2));
		System.out.println("o1 == o3" + (o1 == o3));
		System.out.println("o1 eq o2" + (o1.equals(o3)));
		
		System.out.println("====================================");
		String text1 = "eabc23";
		String text2 = "c2";
		
		System.out.println("compare: " + text1.compareTo(text2));
	}
}
