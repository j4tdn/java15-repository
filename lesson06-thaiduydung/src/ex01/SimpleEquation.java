package ex01;

import java.util.Scanner;

public class SimpleEquation {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Simple Equation (ax + b = 0)");
		System.out.print("Enter a: ");
		double a = checkInputZero();
		System.out.print("Enter b: ");
		double b = checkInput();
		System.out.println("x = " + (-b/a));
	}
	
	private static double checkInput() {
		do {
			try {
				double input = sc.nextDouble();
				return input;
			} catch (Exception e) {
				System.err.print("Invalid input number! Enter again:");
				sc.nextLine();
			}
		} while (true);
	}
	
	private static double checkInputZero() {
		do {
			try {
				double input = sc.nextDouble();
				if (input == 0) {
					System.err.print("0 is invalid! Enter again: ");
					continue;
				}
				return input;
			} catch (Exception e) {
				System.err.print("Invalid input number! Enter again:");
				sc.nextLine();
			}
		} while (true);
	}
}