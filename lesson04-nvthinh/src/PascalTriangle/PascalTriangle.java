package PascalTriangle;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(Tinh(j, i) + " ");
			}
			System.out.println();
		}
	}

	public static int Tinh(int k, int n) {
		if (k == 0 || k == n)
			return 1;
		if (k == 1) 
			return n;
		return Tinh(k - 1, n - 1) + Tinh(k, n - 1);
	}
}
