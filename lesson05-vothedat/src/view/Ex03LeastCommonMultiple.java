package view;

import java.util.Scanner;

public class Ex03LeastCommonMultiple {
	private static int process(int a, int b) {
		if (a == 0 || b == 0)
			return a + b;
		if (a >= b)
			return a - b;
		else
			return b - a;
	}

	private static int getLeastCommonMultiple(int a, int b) {
		return (a * b) / process(a, b);
	}

	private static int result(int Number[], int n) {
		int tmp = getLeastCommonMultiple(Number[0], Number[1]);
		for(int i=2;i<n;i++){
			tmp = getLeastCommonMultiple(Number[i], tmp);
		}
		return tmp;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		if (n > 2 && n < 20) {
			int Number[] = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.println("Nhap phan tu " + (i + 1) + ":");
				Number[i] = Integer.parseInt(ip.nextLine());
			}
			System.out.println("result:" + result(Number, n));
		}
	}
}
