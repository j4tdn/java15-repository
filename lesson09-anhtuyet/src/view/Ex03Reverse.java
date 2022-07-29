package view;

public class Ex03Reverse {
	public static void main(String[] args) {
		String s = " Welcome    to JAVA10    class";
		s= s.replaceAll("\\s+"," ");
		reverseWordInMyString(s);
	}

	public static void reverseWordInMyString(String str) {
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println("s:" + reversedString);
	}
}
