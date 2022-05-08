package control;

import java.util.Random;

public class Ex05Operator {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		boolean isOdd = number % 2 ==0 ? false : true;
		String text = number % 2 != 0 ? "Số lẻ " : "Số chẵn";
		System.out.println("isOdd: " + isOdd);
		System.out.println("text: " + text);
	}
	/*
	 * systax: expression(trả về boolean) ? statement 1: statement 2
	 * if ( expression) {
	 * 		statement 1;
	 * }else {
	 * 		statement 2;
	 * }
	*/ 
	// Is Odd number

}
