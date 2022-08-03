/**
 * Viết chương trình nhập vào một chuỗi kí tự bất kì 
 * sau đó thực hiện các công việc sau :
Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
In ra mỗi kí tự trên một dòng
In ra mỗi từ trên mỗi dòng
In ra chuỗi đảo ngược theo kí tự
In ra chuỗi đảo ngược theo từ
 */

package Ex01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex01 {

	public static boolean validateInput(String input) {
		//kí tự tiếng việt có dấu, phím space
		String regex = ".*[A-Za-z]|\\s";
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

	
	int defaulLength = input.length();
	
	//1.1
	for (int i = 0; i < defaulLength; i++) {
		char c = input.charAt(i);
		System.out.println(c);
	}
	
	//1.2
	String[] noSpaceInput = input.split("\s");
	for (int i = 0; i < noSpaceInput.length; i++) {
		System.out.println(noSpaceInput[i]);
	}
	
	//1.3
//	char[] newInput = input.toCharArray();
//	for (int i=0; i<defaulLength; i++) {
//		System.out.print(newInput[defaulLength-i-1]);
//	}
	
	String reverseString = "";
	for (int i = 0; i < defaulLength; i++) {
		char c = input.charAt(i);
		reverseString = Character.toString(c) + reverseString;
	}
	System.out.println(reverseString);
	
	//1.4
	for (int i = 0; i < noSpaceInput.length; i++) {
		System.out.println(noSpaceInput[defaulLength-i-1]);
		
	}
	
 }
}
