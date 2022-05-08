package control;

import java.util.Random;

public class Ex05Operator {
public static void main(String[] args) {
	// Syntax : expression ? statement 1 : statement 2
	/*
	 * if (expression) {
	 * statement 1;
	 * } else {
	 * statement 2;
	 * }
	 */
	// IsOddNumber
	int  number = new Random().nextInt(10) ;
	boolean isOdd = number %2 !=0  ;
	String text = number %2 !=0 ? "So le" : "So chan";
	System.out.println( " isOdd" + isOdd);
	System.out.println("text : " + text);
}
}
