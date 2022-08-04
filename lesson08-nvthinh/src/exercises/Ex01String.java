package exercises;
import java.util.Scanner;


public class Ex01String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi vao day: ");
		String string = sc.nextLine();
		char[] characters = plitCharracter(string);
		for (char character : characters) {
			System.out.println(character + " ");
		}
		System.out.println("============================");
		String[] words = plitWord(string);
		for (String word : words) {
			System.out.println(word);
		}

		System.out.println("========================");
		
		String results = reverseCharacter(string);
		System.out.println(results);
		
		System.out.println("========================");
		System.out.println(revert(string.replaceAll("\\s+", " ")));
		
	}
	private static char[] plitCharracter(String string) {
		string = string.replaceAll("\\s+", "");

		char[] c = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			c[i] = string.charAt(i);
		}
		return c;

	}
	private static String[] plitWord(String string) {
		String[] word = string.split("\\s+");
		return word;
	}
	private static String reverseCharacter(String string) {
		String result;
		StringBuilder sb = new StringBuilder(string);
	      result = sb.reverse() +" ";
		return result;
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
