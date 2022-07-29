package immutable;

public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";
		
		//1.
		System.out.println(s.startsWith(s1));
		System.out.println("===============================");
		
		//2.
		
		s1 = "good";
		String s2 = "great";
		System.out.println(s.replace(s1, s2));
		System.out.println("===============================");

		//3.
		String s3 = "hope you      have a great working    day";
		System.out.println(s3.replaceAll("\\s+", " "));
		System.out.println("===============================");
		
		//4. 
		String s4 = s.substring(2,6);
		System.out.println(s4);
		System.out.println("===============================");

		//5.
		System.out.println("contains: " + s3.contains(s2));
		
		
	}
}
