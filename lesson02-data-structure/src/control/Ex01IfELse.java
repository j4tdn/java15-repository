package control;

import java.util.Random;

public class Ex01IfELse {
	public static void main(String[] args) {
		Random rd = new Random();
		// Kiểm tra 1 số là chẳn hay lẻ
		int number = 3 + rd.nextInt(5);
		System.out.println("number: " + number);
		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		} else {
			System.out.println(number + " is odd number");
		}
		// Kiểm tra 1 số có chia hết cho 3 không
		if (number % 3 == 0) {
			System.out.println("number again: " + number);
		}
	}
}
