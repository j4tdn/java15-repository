package baitaplogic;

import java.util.Scanner;

public class DayFibonacci {
	public static void main(String[] args) {
		System.out.println(" nhap n");
		int n = new Scanner(System.in).nextInt();
		findFibonacci(n);
	}
	private static void findFibonacci(int n) {
		long f0 = 0;
		long f1 = 1;
		long fn = 0;
		for (int i = 0; i <= n; i++) {
			if( i < 2) {
				System.out.println(i + " : " + i);
			}else {
				fn = f0 + f1;
				f0 = f1;
				f1 = fn;
				System.out.println(i + " : " + fn);
			}
		}
		
	}
}
