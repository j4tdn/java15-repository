package view;

import java.util.Scanner;

public class Ex03 {
	public static int checkHappyNumber(int number) {
		int n = 0, sum = 0;		
		while (number > 0) {
			n = number % 10;
			sum = sum + (n * n);
			number = number / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
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
}
