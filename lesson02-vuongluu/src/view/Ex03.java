package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("input= ");
		int n = ip.nextInt();

		boolean check = reverse_num(n);

		System.out.println(n + "symmetrical number?: " + check);
	}

	private static boolean reverse_num(int n) {
		int reverse = 0;
		int tmp = n;
		while (n > 0) {
			reverse = reverse * 10 + n % 10;
			n /= 10;
		}
		if (!(tmp == reverse)) {
			return false;
		}
		return true;
	}
}
