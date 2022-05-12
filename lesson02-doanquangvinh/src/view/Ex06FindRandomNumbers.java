package view;

import java.util.Scanner;

/**
 * Ex06FindNumber
 */
public class Ex06FindRandomNumbers {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number you want to find :");
		int result = ip.nextInt();
		findPrimeNumber(result);

	}

	private static boolean isPrimeNumber(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static int findPrimeNumber(int result) {
		int count = 0;
		for (int i = 1; i <= result; i++) {

			if (isPrimeNumber(i)) {
				count++;
			}
			if (count == 200) {
				System.out.println("the value of prime number" + count + "is " + i);
				break;
			}
		}

		return count;

	}
}
