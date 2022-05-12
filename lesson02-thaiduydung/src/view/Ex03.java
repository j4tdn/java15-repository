package view;

import java.util.Scanner;

public class Ex03 {
	public static boolean isSymmetric(long number) {
		String oldNum = "" + number; 
		String newNum = "";
		for (int i = oldNum.length() - 1; i >= 0; i--) {
			newNum += oldNum.charAt(i);
		}
		return newNum.equalsIgnoreCase(oldNum);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number: ");
		long number = new Scanner(System.in).nextLong();
		if (isSymmetric(number)) {
			System.out.println(number + " is a symmetric number");
		} else {
			System.out.println(number + " isn't a symmetric number");
		}
	}
}