package ex03;

import java.util.Scanner;

// Lesson05 Exam KF
// Tìm số tự nhiên hợp lệ lớn nhất trong chuỗi. Biết rằng chuỗi chỉ gồm
// các ký tự số và chữ cái không dấu.
public class FindMaxValidNumber {
	private static Scanner sc = new Scanner(System.in);
	
	public static int getMaxValidNumber(String str) {
		int numberOfCharacterNeedToDelete = 0;
		String sequenceNumber = "";
		for(int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if(currentChar >= 48 && currentChar <= 57) {
				sequenceNumber = sequenceNumber + currentChar;
			} else {
				sequenceNumber = sequenceNumber + "\n0";
				numberOfCharacterNeedToDelete += 2;
			}
		}
		System.out.println(sequenceNumber);
		int[] numbers = new int[sequenceNumber.length()-numberOfCharacterNeedToDelete];
		System.out.println("Length of numbers is " +numbers.length);
		Scanner readNumber = new Scanner(sequenceNumber);
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(readNumber.nextLine());
			System.out.println("Oke roi! " + numbers[i]);
		}
		System.out.println("Our numbers are: ");
		for(int n : numbers) {
			System.out.println(n);
		}
		return 0;
	}
	public static void main(String[] args) {
		String str;
		System.out.println("Input a random string: ");
		str = sc.nextLine();
		int result = getMaxValidNumber(str);
		System.out.println("Max valid number is "+result);
	}
}
