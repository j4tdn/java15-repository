package baitaplogic;

import java.util.Scanner;

public class TongPhanSo {
	public static void main(String[] args) {
		System.out.println(" nhap n");
		int n = new Scanner(System.in).nextInt();
		System.out.println("tong " +sum(n));
	}
	private static float sum(int n) {
		float sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (float) 1 / i;
		}
		return sum;
	}
}
