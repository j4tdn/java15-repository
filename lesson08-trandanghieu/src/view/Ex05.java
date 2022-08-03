package view;

public class Ex05 {
	public static void main(String[] args) {
		String s1="ABCEDEABC";
		String s2="ABCEDCBBCK";
		findAllSubSetOfString(s1, s2);
		
		
	}
	private static String findAllSubSetOfString(String s1, String s2) {
		 int longest = 0;
		    String longestSubstring = "1";

		    for (int i=0; i < s1.length(); i++) {
		        for (int j=i+1; j <= s1.length(); ++j) {
		            String substring = s1.substring(i, j);
		            if (s2.contains(substring) && substring.length() > longest) {
		                longest = substring.length();
		                longestSubstring = substring;
		            }
		        }
		    }

		    return longestSubstring;
		
	}
}
