package view;

import java.util.Scanner;

public class Ex03SymmetricalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = ip.nextInt();
		if(reverseNumber(n) == n) {
			System.out.println(n + " is symmetrical number");
		} else {
			System.out.println(n + " is not symmetrical number");
		}
	}
	
	private static int reverseNumber(int n) {
		int reverse = 0;
		while (n > 0) {
			reverse = reverse * 10 + n % 10;
			n = n / 10;
		}
		return reverse;
	}
}
