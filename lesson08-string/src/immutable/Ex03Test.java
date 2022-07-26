package immutable;

public class Ex03Test {
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "bye";
		String s3 = "hello";
		String o1 = new String("welcome");
		String o2 = new String("enjoy");
		String o3 = new String("welcome");

		String o4 = new String("bye");
		System.out.println("s1 == s2:" + (s1 == s2));
		System.out.println("s1 == s3:" + (s1 == s3));
		System.out.println("s1 eq s2: " + s1.equals(s2));

		System.out.println("o1 == o2:" + (o1 == o2));
		System.out.println("o1 == o3:" + (o1 == o3));
		System.out.println("o1 eq o3: " + o1.equals(o3));
		
		System.out.println("============================");
		String text01 = "eabc23";
		String text02 = "c2";
		System.out.println("compare: " + text01.compareTo(text02));
		
		
	}

}
