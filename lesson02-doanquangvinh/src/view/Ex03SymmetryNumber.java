package view;

import java.util.Random;
import java.util.Scanner;

public class Ex03SymmetryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter random number : ");
		int number = ip.nextInt();
		// isSymmetricNumber(1234);
		System.out.println(caculateSizeOfNumber(number));
	//	System.out.println(reversedNumber(number));
		System.out.println(isSymmetricNumber(number));
	}
	private static int caculateSizeOfNumber(int number) {
		int count = 0;
		if (number == 0) {
			return 1;
		} else {
			while (number != 0) {
				number = number / 10;
				count++;
			}
			return count;
		}
	}
	private static int reversedNumber(int number) {
		int a = 0;
		int size = caculateSizeOfNumber(number);
		for (int i = size; i > 0; i--) {
			a = a + (int) (number % 10 * Math.pow(10, i - 1));
			System.out.println(a);
			number = (int) number/10;
			System.out.println(number);
		}
		return a;
	}

	private static boolean isSymmetricNumber(int number) {
		if (reversedNumber(number) == number) {
			return true;
		}
		return false;
	}
}