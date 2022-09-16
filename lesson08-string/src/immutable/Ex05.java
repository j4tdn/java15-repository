package immutable;

public class Ex05 {

	public static void main(String[] args) {
		String s = "today is a good day";
		String s1 = "day";
		// 1
		System.out.println(s.startsWith(s1));
		System.out.println(s.endsWith(s1));
		s1 = "good";
		String s2 = "great";
		System.out.println(s = s.replace(s1,s2));
		
		
		String s3 = "hope you    have a great working   day";
		s3 = s3.replaceAll("\\s+", " ");
		System.out.println(s3);
		
		//4 
		s1 = "today";
		s2 = s.substring(2,5);
		System.out.println("s2 :"+ s2);
		System.out.println("contains: "+ s1.contains(s2));
	
		
		// 5
			
		
	}

}
