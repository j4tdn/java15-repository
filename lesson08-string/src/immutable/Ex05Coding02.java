package immutable;

public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";
		//1
		String s2 = "great";
		
		String s3 = " xin chao   cac   ban";
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));
		//2
		System.out.println(s.replaceAll(s1, s2));
		
		
		//3.regex ==> regular expression
		
		s3 = s3.replaceAll("\\s+", " ");
		System.out.println("s3 " +s3);
		
		//4.
		s1 = "today";
		s2 = s.substring(2, 5);
		System.out.println("n" +s2);
		
		//5
		System.out.println("contains " + s1.contains(s2));
	}
}
