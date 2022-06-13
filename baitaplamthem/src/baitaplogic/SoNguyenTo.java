package baitaplogic;

import java.util.Scanner;

public class SoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập N");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("các số nguyên tố từ 1 đến " + n + " : ");
		if(n > 2) {
			System.out.print(2);
		}
		for (int i = 3; i < n; i += 2) {
			if (isPrimeNumber(i)) {
				System.out.print(" " +i);
			}

		}
	}

	private static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
