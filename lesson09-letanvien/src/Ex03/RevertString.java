package Ex03;

public class RevertString {

	public static void main(String[] args) {
		String string = "Welcome   to JAVA10 class";
		System.out.println(revert(string));
	}
	
	private static String revert(String s) {
		s = s.replaceAll("[,\\s]+", " ").trim();
		String[] words = s.split(" ");
		String result = "";
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for(int k = word.length() - 1; k >= 0; k--) {
				reverseWord += word.charAt(k);
			}
			result += reverseWord + " ";
		}
		
		return result;
	}
}
