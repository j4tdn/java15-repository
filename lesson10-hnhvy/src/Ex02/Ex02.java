/*
 * Viết chương trình cho phép người dùng nhập vào họ và tên 
 * sau đó in ra kết quả theo yêu cầu sau:

Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
Các kí tự cách nhau một khoảng trắng
Example : aDam Le vAN john   Son =>

 String[] noSpaceInput = ["aDam", "Le", "vAN,...]
 
 Adam Le Van John Son
 */

package Ex02;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
	public static boolean validateInput(String input) {
		//kí tự tiếng việt có dấu, phím space
		String regex = ".*[A-Za-z]";
		Pattern p = Pattern.compile(regex);
		if (input == null) {
	        return false;
	    }
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi ký tự bất kỳ: ");
		String input = sc.nextLine();
		while(!validateInput(input)) {
			System.out.println("Nhập vào chuỗi ký tự bất kỳ chỉ chứa các kí tự tiếng việt có dấu, phím space: ");
			input = sc.nextLine();
		}
		
//		String[] noSpaceInput = input.split("\\s");
//		String output = "";
//		for (int i = 0; i < noSpaceInput.length; i++) {
//			output = output + noSpaceInput[i] + " ";
//		}
//		System.out.println(output);
//	
		String formattedText = "";
	
		String[] words = input.split("\\s{1,}");
		for(String word: words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		System.out.println(formattedText);
		
		}
}
