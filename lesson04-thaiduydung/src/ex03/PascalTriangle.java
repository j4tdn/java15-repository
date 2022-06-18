package ex03;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.print("Enter size: ");
		int n = new Scanner(System.in).nextInt();
		draw(n);
	}
	
	public static void draw(int n) {
		for (int i = 1; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(combination(j, i) + "\t");
			}
			System.out.println();
		}
	}

	public static int combination(int k, int n) {
		if (k == 0 || k == n) {
			return 1;
		}
		if (k == 1) {
			return n;
		}
		return combination(k - 1, n - 1) + combination(k, n - 1);
	}
}