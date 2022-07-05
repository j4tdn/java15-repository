package view;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean check = true;
		float a, b, x;
		do {
			try {
				System.out.print("Enter value of variable a :");
				a = ip.nextFloat();
				System.out.print("Enter value of variable b :");
				b = ip.nextFloat();

				System.out.println("value of x :" + divide(a, b));
				check = false;

			} catch (ArithmeticException e) {

				System.out.println(e.getMessage());
				check = true;
			} catch (Exception e) {
				System.out.println("Not a number !! Please Enter number again");
				check = true;
				ip.next();
			}

		} while (check);
	}

	private static float divide(float a, float b) {
		if (a == 0) {
			throw new ArithmeticException(" a can not be 0 !! Please try again");
		}
		return -b / a;
	}

}
