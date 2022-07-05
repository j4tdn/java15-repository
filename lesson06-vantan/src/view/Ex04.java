package view;

import java.util.Scanner;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String numAsString = null;
		do {
			System.out.println("Enter the number : ");
			numAsString = sc.nextLine();
			if (numAsString.matches("\\d+")) {
				break;
			}
			System.out.println("invalid number");
		} while (true);
		int n = Integer.parseInt(numAsString);
		System.out.println(readNumber(n));
	}

	private static String readNumber(int n) {

		String[] num = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười" };
		String[] kd = { "Mươi", "Trăm" };
		if (n <= 10) {
			return num[n];
		}
		if (n > 10 && n < 20) {
			return "MƯỜI " + num[n % 10];
		}
		if (n >= 20 && n <= 90 && n % 10 == 0) {
			return num[n / 10] + " MƯƠI ";
		}
		if (n > 20 && n < 100) {
			if (n % 10 == 1) {
				return num[n / 10] + " " + kd[0] + " Mốt";
			} else {
				return num[n / 10] + " " + kd[0] + " " + num[n % 10];
			}
		}
		if (n >= 100 && n < 1000) {
			int s = n / 10;
			int v = s % 10;
			if (n % 100 > 10 && n % 10 != 0) {

				return num[n / 100] + " " + kd[1] + " " + num[v] + " " + kd[0] + " " + num[n % 10];
			} else if (n % 10 == 0 && n % 100 != 10) {
				return num[n / 100] + " " + kd[1] + " " + num[v] + " " + kd[0];
			} else if (n % 100 == 10) {
				return num[n / 100] + " " + kd[1] + " Mười";
			} else {
				return num[n / 100] + " " + kd[1] + " linh " + num[n % 10];
			}
		}
		return " Exceed the limits";
	}

}
