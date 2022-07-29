package exercises;

public class Ex03revert {

	public static void main(String[] args) {
		
		String s = "Welcome      to JAVA10       class";
		System.out.println(s);
		System.out.println(s.replaceAll("\\s+", " "));
		System.out.println(revert(s.replaceAll("\\s+", " ")));
	}
	
	private static String revert(String s) {
		String[] words = s.split("\\s");//tach theo khoang trang
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	            String word = words[i];
	            String reverseWord = "";
	            for (int j = word.length()-1; j >= 0; j--)
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	            reversedString = reversedString + reverseWord + " ";
	        }
		
		return reversedString;
	}


}
