import java.util.Scanner;

/**
 * Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
In ra mỗi kí tự trên một dòng
In ra mỗi từ trên mỗi dòng
In ra chuỗi đảo ngược theo kí tự
In ra chuỗi đảo ngược theo từ
 * */
public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s;
		System.out.print("Enter string: ");
		s = input.nextLine();
			
		System.out.println("Print each character per line: ");
		printCharacter(s);
		System.out.println("==============================");
		System.out.println("Print each word per line: ");
		printWord(s);
		System.out.println("==============================");
		System.out.println("Print the reversed string by character: ");
		reserveCharacter(s);
		System.out.println("==============================");
		System.out.println("Print the reversed string by word: ");
		reserveWord(s);
	}
	
	//In ra mỗi kí tự trên một dòng
	private static void printCharacter(String s) {
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ') {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	//In ra mỗi từ trên mỗi dòng
	private static void printWord(String s) {
		String[] words = s.split("[\\s]+");
		for (String word:words) {
			System.out.println(word);
		}
	}
	
	//In ra chuỗi đảo ngược theo kí tự
	private static void reserveCharacter(String s) {
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		System.out.println(s1.toString());
	}
	
	//In ra chuỗi đảo ngược theo từ
	private static void reserveWord(String s) {
		String[] words = s.split("[\\s]+");
		for(int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " ");
		}
	}
}
