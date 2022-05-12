package control;

import java.util.Random;

public class Ex05Operator {
	public static void main(String[] args) {
		// Syntax: expression ? statement1 : statement2
		/*
		 * if(expression) { statement1; }else { statement2; }
		 */

		// Iss Odd number
		int number = new Random().nextInt(10);
		System.out.println("    " + number);
//		boolean isOdd = false;
//		if(number % 2 == 0) {
//			isOdd = false;
//		}else {
//			isOdd = true;
//		}

//		boolean isOdd = number % 2 == 0 ? false : true;

		boolean isOdd = number % 2 != 0;

		String text = number % 2 != 0 ? "Số lẻ" : "Số chẳn";
		System.out.println("isOdd: " + isOdd);
		System.out.println("text: " + text);
	}
}
