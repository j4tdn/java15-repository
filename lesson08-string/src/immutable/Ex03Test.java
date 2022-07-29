package immutable;

public class Ex03Test {
	public static void main(String[] args) {
		//==(compare address) equals(compare value) ==> primitive object 
		// == is always compare variable at STACK
		//equals live at main class of JAVA
		
		String s1 = "hello";
		String s2 = "bye";
		String s3 = "hello";
		
		String o1 = new String("welcome");
		String o2 = new String("enjoy");
		String o3 = new String("welcome");
		String o4 = new String("bye");
		
		System.out.println((s1==s2));
		System.out.println((s1==s3));
		System.out.println(s1.equals(s2));
		
		System.out.println("===============");
		System.out.println((o1==o2));
		System.out.println((o1==o3));
		System.out.println(o1.equals(o2));
	}
}
