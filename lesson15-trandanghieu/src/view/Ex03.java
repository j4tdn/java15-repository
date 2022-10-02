package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int number = ip.nextInt();
		int result = number;
		while (result != 1 && result != 4) {
			result = checkHappyNumber(result);
		}
		if (result == 1) {
			System.out.println("It is a Happy Number");
		} else {
			System.out.println(" It is not a Happy Number");
		}
	}

	public static int checkHappyNumber(int number) {
		int rem = 0;
		int sum = 0;
		while (number > 0) {
			rem = number % 10;
			sum = sum + (rem * rem);
			number = number / 10;
		}
		return sum;
	}
}
