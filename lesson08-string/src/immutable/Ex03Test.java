package immutable;

public class Ex03Test {
	public static void main(String[] args) {
		//String == địa chỉ (adress) equals(value)
		//==(so sánh giá trị ở STACK )equal ==> primitive object
		String s1 = "hello";
		String s2 = "bye";
		String s3 = "hello";
		
		String o1 = new String ("welcome");
		String o2 = new String ("enjoy");
		String o3 = new String ("welcome");
		
		String o4 = new String ("bye");
		
		System.out.println("s1==s2: " + (s1==s2)); //F
		System.out.println("s1==s3: " + (s1==s3));// T
		System.out.println("s1 eq s2: " + (s1.equals(s2))); //T
		
		System.out.println("o1==o2: " + (o1==o2));// F
		System.out.println("o1==o3: " + (o1==o3)); // F
		System.out.println("o1 eq o2: " + (o1.equals(o2))); //T
		
		System.out.println("=========================");
		String text01 = "aabc23";
		String text02 = "d2";
		System.out.println("compare: " + text02.compareTo(text01)); //int
	}
}
