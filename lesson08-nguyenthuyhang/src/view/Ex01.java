package view;

public class Ex01 {
	public static void main(String[] args) {
		String s = "Chuỗi chỉ chứa các kí tự tiếng việt có dấu";
		
		System.out.println("Print each character per line: ");
		printCharacter(s);
		System.out.println("Print each word per line: ");
		printWord(s);
		System.out.println("Print the reversed string by character: ");
		reverseCharacter(s);
		System.out.println("Print the reversed string by word: ");
		reserveWord(s);
	}
	private static void printCharacter(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
	}
	private static void printWord(String s) {
		String []words = s.split("\\s+");
		for(String word:words) {
			System.out.println(word);
		}
	}
	private static void reverseCharacter(String s) {
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse().toString());
	}
	private static void reserveWord(String s) {
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}
	}
}
