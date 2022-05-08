package control;

import java.util.Random;

public class Ex01IfElse {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = 3 + rd.nextInt(5);
		
		System.out.println("Random Number: " + number);
		
		if(number % 2 == 0) {
			System.out.println(number + " is even nuber");
		}else {
			System.out.println(number + " is odd nuber");
		}
	}
}
