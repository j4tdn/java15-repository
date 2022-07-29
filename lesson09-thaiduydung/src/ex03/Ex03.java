package ex03;

public class Ex03 {
	public static void main(String[] args) {
		String input = "  Welcome    to  JAVA10  class   ";
		System.out.println("Input: " + input);
		System.out.println("Output: " + getReverseString(input));
	}
	
	private static String getReverseString(String s) {
		s = s.trim();
		String[] getWords = s.split("\\s+");
		int index = 0;
		for (String word : getWords) {
			StringBuilder sbd = new StringBuilder(word);
			getWords[index++] = sbd.reverse().toString();
		}
		String result = "";
		for (String word : getWords) {
			result = result.concat(word + " ");
		}
		return result.trim();
	}
}