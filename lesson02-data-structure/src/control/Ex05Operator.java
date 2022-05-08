package control;

import java.util.Random;

public class Ex05Operator {
	public static void main(String[] args) {
		// Syntax: expression ? statement 1 : statement 2
		/*
		 * if (expression){
		 * 		statement 1;
		 * }else{
		 * 		statement 2;
		 * }
		 */
		//Is odd number 
		int number = new Random().nextInt(10);
		boolean isOdd = number % 2 != 0;
		
		String text = number % 2 != 0 ? "Số Lẻ" : "Số chẵn";
		System.out.println("IsOdd: " + isOdd);
		System.out.println("Text: " + text);
		
	}
}
