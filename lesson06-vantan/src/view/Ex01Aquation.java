package view;

import java.util.Scanner;

public class Ex01Aquation {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		float a = 0, b;
		float x;
		do {
			System.out.println("Enter a");
			a = input();
			if(a != 0) {
				break;
			}
			System.out.println("invalid Number");
		} while (true);
		System.out.println("Enter b : ");
		b = input();
		x = aquation(a, b);
		System.out.println("x = " + x);

	}

	private static float input() {
		String aAsString = null;
		float a = 0;
		//validate
		do {
			try {

				aAsString = ip.nextLine();
				a = Integer.parseInt(aAsString);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.println("Invalid Number");
			}

		} while (!aAsString.matches("\\d+"));

		return a;
	}

	private static float aquation(float a, float b) {
		if (a == 0) {
			throw new ArithmeticException("a cannot be null");
		}
		return -b / a;
	}
}
