package control;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random( ) ;
		
		// Kiem tra 1 so la chan hay le
		
		int number = 3 + rd. nextInt(5);
		System. out . println( "number: "+ number) ;
		if (number % 2 == 0) {
		System. out . println(number + " is even number");
		}else {
		System. out . println(number + " is odd number");
		}
		
		// Kiem tra 1 so co chia het cho 2 khong

	}
}
