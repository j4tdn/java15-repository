package control;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		// Kiểm tra 1 số là chẵn hay lẻ
		Random rd = new Random();
		int num = rd.nextInt(2, 8);
		System.out.println("number: " + num);
		if (num % 2 == 0) {
			System.out.println("num is even number");
		} else {
			System.out.println("num is odd number");
		}
		
		// Kiểm tra 1 số có chia hết cho 3 không
		if(num % 3 == 0) {
			System.out.println("num again: " + num);
		}
	}
}
