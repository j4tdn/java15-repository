package view;

import java.util.Scanner;

public class Ex03SymmetricNumber {
	private static Scanner sc = new Scanner(System.in);

	private static int inputPositiveValue(String promt, String error) {
		int n;
		while (true) {
			System.out.print(promt);
			String nInText = sc.nextLine();
			if (nInText.matches("\\d+")) {
				n = Integer.parseInt(nInText);
				break;
			} else {
				System.out.println(error);
			}
		}
		return n;
	}

	private static boolean isSymmetricNumber(int n) {
		int numberOfDigits = numberOfDigits(n);
		if (numberOfDigits == 1) {
			return true;
		} else {
			int temp = n;
			int reverseNum = 0;
			while (temp != 0) {
				reverseNum += (temp % 10) * Math.pow(10, numberOfDigits - 1);
				numberOfDigits--;
				temp /= 10;
			}
			return reverseNum == n;
		}
	}

	private static int numberOfDigits(int n) {
		int count = 0;
		if (n == 0) {
			count = 1;
		} else {
			while (n != 0) {
				n /= 10;
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int n;
		n = inputPositiveValue("Enter number: ", "Invalid number! Please try again!");

		String result = isSymmetricNumber(n) ? n + " is a symmetric number."
				: n + " is not a symmetric number.";
		System.out.println(result);
	}
}
