package control;

import java.util.Random;

//toán tử 3 ngôi
public class Ex05Operator {
	public static void main(String[] args) {
		//Syntax: expression ? statement1 : statement2
		/*
		 * if (expression){
		 * statement 1;
		 * } else {
		 * statement 2;
		 * }
		 */
		
		//is odd number
		int number = new Random().nextInt(10);
		boolean isOdd = number % 2 != 0;
		/* cach khac
		boolean isOdd = false;
		if (number % 2 == 0) {
			isOdd = false;
		} else {
			isOdd = true;
		}
		*/
		String text = number % 2 != 0 ? "Số lẻ" : "Số chẵn";
		System.out.println("is odd: " + isOdd);
		System.out.println("text: " + text);
	}
}
