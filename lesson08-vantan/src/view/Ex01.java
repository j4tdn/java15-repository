package view;

public class Ex01 {
	public static void main(String[] args) {
		String word = "tôi yêu Việt Nam";
		//1.
		getAlphabetInLine(word);
		//2
		getWordInLine(word);
		//3
		rever(word);
		//3.1
		rever2(word);
		//4. 
		reverseWord(word);
	}
	//in ra mỗi kí tự trên mỗi dòng
	private static void getAlphabetInLine(String word) {
		String formatted = word.trim().replaceAll("\\s+", "");
		for (int i = 0; i < formatted.length(); i++) {
			System.out.println(formatted.charAt(i));
		}
	}
	//in ra mỗi từ trên mỗi dòng
	private static void getWordInLine(String word) {
		
		String[] words = word.split("\\s+");
		for (String wo : words) {
			System.out.println(wo);
		}
	}
	//in ra chuỗi đảo ngược theo từ
	private static void rever(String word) {		
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.println();
		
	}
	//in ra chuỗi đảo ngược theo từ cách 2
	private static void rever2(String word) {
		StringBuilder builder =  new StringBuilder(word);
		builder.reverse();
		System.out.println(builder.toString());
	}
	//in ra chuỗi đảo ngược theo từ
	private static void reverseWord(String word) {
		StringBuilder builder = new StringBuilder();
		String[] words = word.split("\\s+");
		for (String string : words) {
			builder.append(reverse(string)+ " ");			
		}
		System.out.println(builder);
	}
	private static String reverse(String word) {
		StringBuilder builder = new StringBuilder(word);
		return builder.reverse().toString();
	}
}
