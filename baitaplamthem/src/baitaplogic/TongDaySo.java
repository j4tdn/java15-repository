package baitaplogic;

import java.util.Random;

public class TongDaySo {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(100000, 300000);
		System.out.println(n);
		findUoc(n);
		
		System.out.println("\n");
		System.out.println(tinhTong(n));
		
	}
	private static int tinhTong(int n) {
		int sum = 0;
		do {
			sum += n % 10;
			n /= 10;
		}while (n > 0);
		return sum;
	}
	private static void findUoc(int n) {
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	private static boolean isPrimeNumber(int n) {
		if(n < 2) {
			return false;
		}
		for (int i = 0; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
