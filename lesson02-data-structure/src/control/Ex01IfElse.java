package control;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		// Kiểm tra 1 số là chẵn hay lẻ
		int number = 3 + rd.nextInt(5);
		System.out.println("Number: "+number);
		if (number % 2 == 0) {
			System.out.println(number+" is even number");
		} else {
			System.out.println(number+" is odd number");
		}
		// Kiểm tra 1 số có chia hết cho 3
		if (number % 3 == 0) {
			System.out.println("number again: "+number);
		}
		
	}
}
