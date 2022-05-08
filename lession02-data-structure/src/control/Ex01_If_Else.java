package control;

import java.util.Random;

public class Ex01_If_Else {
	public static void main(String[] args) {
		Random rd = new Random();
		int number = 3 + rd.nextInt(5);
		System.out.println("number: " + number);
		if(number % 3 == 0) {
			System.out.println(number + " is even number");
		}
		
	}
}
