package view;

import java.util.Scanner;

public class Ex03HappyNumber {
	public static void main(String[] args) {
		//===============================
		int number = 13;
		
		int result = number;
		while (result != 1 && result != 4) {
			result = check(result);
		}
		if (result == 1) {
			System.out.println("It is Happy Number");
		} else {
			System.out.println(" It is not Happy Number");
		}
	}

	public static int check(int number) {
		int rem = 0, sum = 0;
		while (number > 0) {
			rem = number % 10;
			sum = sum + (rem * rem);
			number = number / 10;
		}
		return sum;
	}
}
