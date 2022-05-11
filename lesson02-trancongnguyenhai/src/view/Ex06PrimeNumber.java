package view;

import java.lang.Math;
import java.util.Scanner;

public class Ex06PrimeNumber {
	public static void main(String[] args) {
		long num = 0;
		int count = 0;
		Scanner ip = new Scanner(System.in);
		System.out.print("Input: ");
		int n = ip.nextInt();
		while (count != n) {
			num++;
			if (isPrime(num)) {
				count++;
			}
		}
		System.out.print("-->Output: " + num);
	}

	private static boolean isPrime(long num) {
		if (num < 2)
			return false;
		if (num == 2 || num == 3)
			return true;
		if (num % 2 == 0 || num % 3 == 0)
			return false;
		for (long i = 5; i <= Math.sqrt(num); i += 6) {
			if (num % i == 0 || num % (i + 2) == 0)
				return false;
		}
		return true;
	}
}
