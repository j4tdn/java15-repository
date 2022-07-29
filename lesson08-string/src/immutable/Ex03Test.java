package immutable;

public class Ex03Test {
	public static void main(String[] args) {
		// == equals ==> primitive object
		
		//String == (address) equals(value)
		String s1 = "Hello";
		String s2 = "bye";
		String s3 = "Hello";
		
		String o1 = new String("welcome");
		String o2 = new String("enjoy");
		String o3 = new String("welcome");
		
		String o4 = new String("bye");
		
		System.out.println("s1==s2" + (s1==s2));//f
		System.out.println("s1==s3" + (s1==s3));//t
		System.out.println("s1eq s2" + (s1.equals(s2)));//f
		
		System.out.println("o1==o2" + (o1==o2));//f
		System.out.println("o1==o3" + (o1==o3));//f
		System.out.println("o1 eq o2" + (o1.equals(o2)));//t
		
		
		System.out.println("========================================");
		
		String text1 = "aabc23";
		String text2 = "z2";
		
		System.out.println("compare:" text1.compareTo(text2));
				
	}
}
