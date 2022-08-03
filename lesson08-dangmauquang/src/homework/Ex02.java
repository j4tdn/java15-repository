package homework;
import java.util.Scanner;

/**
	Bài 2: Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu
	sau:
	
	Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
	Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
	Các kí tự cách nhau một khoảng trắng
	Example : aDam Le vAN john Son => Adam Le Van John Son
	Anne frAnk => Lê Phan
 */
public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			System.out.println("Nhập họ và tên: ");
			String name = sc.nextLine();

			if (name.matches("[a-zA-Z\s]{1,}")) {
				System.out.println(format(name));
				break;
			}
		} while (true);
	}
	private static String format(String text) {
		String formattedWord = "";
		String[] words =  text.split("[\\s]{1,}");
		for(String word: words) {
			char firstLetter = word.charAt(0);
			formattedWord += Character.toUpperCase(firstLetter) + 
					word.substring(1).toLowerCase() + " ";
		}
		return formattedWord;
	}
}
