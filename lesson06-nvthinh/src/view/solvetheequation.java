package view;

import java.util.Scanner;

public class solvetheequation {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean check = true;
		do {
			try {
				System.out.println("Nhap a:");
				float a = ip.nextFloat();
				System.out.println("Nhap b:");
				float b = ip.nextFloat();
				System.out.println(giaiphuongtrinh(a, b));
				check = true;
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
				check = true;
			} catch (Exception e) {
				System.out.println("Nhap chu lam gi vay bro ?");
				check = true;
				//ip.next();

			}

		} while (check);

	}

	public static float giaiphuongtrinh(float a, float b) {
		if (a == 0) {
			throw new ArithmeticException("Nhap sai roi kia broo ");
		}
		return -b / a;

	}
}
