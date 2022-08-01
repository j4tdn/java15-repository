package view;
/**
 * 
 * Viết chương trình cho phép người dùng nhập vào họ và tên sau đó in ra kết quả theo yêu cầu
sau:

Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
Các kí tự cách nhau một khoảng trắng
Example : aDam Le vAN john Son => Adam Le Van John Son
Anne frAnk => Lê Phan
 *
 */
public class Ex02 {
	public static void main(String[] args) {
		String text = "aDam Le vAN john Son";
		System.out.println(format(text));
	}
	private static String format(String text) {
		String formattedText ="";
		String[] word = text.split("[\\s]+");
		for(String words : word) {
			String formattedWord = Character.toUpperCase(words.charAt(0)) + words.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}
}
