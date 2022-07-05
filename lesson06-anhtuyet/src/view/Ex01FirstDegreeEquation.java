package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = 0;
		float b = 0;
		do {
			try {
				System.out.println("Enter a=");
				a = Integer.parseInt(sc.nextLine());
				System.out.println("Enter b =");
				b = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				System.out.println("Incorrect, again input");
			}
		} 
		while (true);
		try {
			System.out.println("X = " + divide(a, b));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private static float divide(float a, float b) {
		if (a == 0) {
			if (b == 0) {
				throw new ArithmeticException("Equation with infinite solutions");
			} else {
				throw new ArithmeticException("The equation has no solution");

			}
		}
		return -b / a;
	}

}
