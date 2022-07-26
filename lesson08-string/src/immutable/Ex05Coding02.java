package immutable;

public class Ex05Coding02 {
	public static void main(String[] args) {
		//1.
		String s= "today is a good day";
		String s1 = "day";
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));
		//2.
		s1 = "good";
		String s2 = "great";
		String replaceString = s.replaceAll(s1, s2);
		System.out.println(replaceString);
		//3.
		String s3 = "hope   you      have a great working   day";
		s3 =s3.replaceAll("\\s+", " ");
		System.out.println("s3: " + s3);
		//4.
		s2 = s.substring(2,5);
		System.out.println(s2);
		System.out.println("contains: " + s1.contains(s2));
	}

}
