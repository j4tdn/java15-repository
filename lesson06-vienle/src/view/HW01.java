package view;

import java.util.Scanner;

public class HW01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		

		try {
			System.out.print("Input A: ");

			a = Integer.parseInt(sc.nextLine());

			System.out.print("Input B: ");

			b = Integer.parseInt(sc.nextLine());

			System.out.println(a + "x" + " + " + b + " = " + firstDegreeEquation(a, b));
			
		} catch (NumberFormatException e) {
			
			System.out.println("not a number");

		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());

		}

	}

	private static double firstDegreeEquation(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("A cannot be 0");
		}

		return -b / a;
	}


}
