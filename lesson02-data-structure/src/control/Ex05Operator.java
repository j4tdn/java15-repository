package Control;

import java.util.Random;


public class Ex05Operator {
	public static void main(String[] args) {
		// Syntax: expression ? statement 1: statement 2
		/* 
		 * if (expression) {
		  	statement 1;
		  } else {
		  	statement 1;
		  }
		 */
		// Is Odd number
		//Random rd = new Random();
		int number = new Random().nextInt(10);
		boolean isOdd = number % 2 != 0;
		/*if (number % 2 == 0) {
			isOdd = false;
		} else { isOdd = true;}
	*/
		String text = number % 2 != 0 ? "So le" : "So chan";
		System.out.println("isOdd: "+ isOdd);
		System.out.println("text: "+text);
	}
}
