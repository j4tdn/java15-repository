package immutable;

public class Ex05Coding02 {
	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";
		
		s1 = "good";
		String s2 = "great";
		
		String s3 = "hope   you      have a great working    day";
		
		System.out.println("startsWith: " + s.startsWith(s1));
		System.out.println("endsWith: " + s.endsWith(s1));
		System.out.println(("Replaced: " + s.replace(s1,s2)));
		s3 = s3.replaceAll("\\s+", " ");
		System.out.println("s3: " + s3);
		
		s1 = "today";
		s2 = s.substring(2, 8);
		System.out.println("s2: " + s2);
		
		System.out.println("contains: " + s1.contains(s2));
		
		
		
	}
}
