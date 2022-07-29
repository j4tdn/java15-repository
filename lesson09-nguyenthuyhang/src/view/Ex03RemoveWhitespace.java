package view;


public class Ex03RemoveWhitespace {
	public static void main(String[] args) {
		String text = " Welcome  toJAVA15   class";
		text = text.replaceAll("\\s+"," ");
		System.out.println("text: " + text);
		
		reverse(text);
	}

	
	public static void reverse(String str) {
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
		System.out.println("text: " + reversedString);
	}
}


