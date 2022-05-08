package control;

import java.util.Random;

public class Ex05_Operator {
	public static void main(String[] args) {
		//
		int a = 2;
	//	int b =4;
		//System.out.println((a > b) ? a : b);
		int number = new Random().nextInt(10);
		boolean isOdd = number % 2 != 0;
		String text = number % 2 != 0 ? " So le" : "So chan";
		System.out.println("is Odd: " + isOdd);
		System.out.println("text: " + text );
		
	}
}
