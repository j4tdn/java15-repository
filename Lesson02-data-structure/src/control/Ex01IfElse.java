package control;

import java.util.Random;

public class Ex01IfElse {

	public static void main(String[] args) {
		Random rd = new Random();
       // Kiem tra 1 so la chan hay le
		int number = rd.nextInt(0, 10);
		System.out.println(" Number : " + number);
		if (number %2 ==0) {
			System.out.println(number + " Is even number ");
			} else {
				System.out.println(number + " Is odd number  ");
			}
		// Kiem tra 1 so co chia het cho 5 khong
		if (number %5 ==0) {
			System.out.println(number + " Is divided number  ");
		}
		
	}

}
