package control;

import java.util.Random;

public class Ex05Operator {
	public static void main(String[] args) {
		// syntax:expression ? tatement 1: statement 2
		/**
		  if(expression)
		  { statement 1; 
		  } else{ statement 2; }
		 */

		// is odd number
		int number = new Random().nextInt(10);
		boolean isOdd = number % 2 != 0 ;
		String text=number%2 !=0? " số lẻ" : " số chẵn";
		System.out.println("isOdd" + isOdd);
		System.out.println("text" + text);

	}

}
