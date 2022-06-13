package baitaplogic;

import java.util.Scanner;

public class TongChanLe {
	public static void main(String[] args) {
		System.out.println("nhap n");
		int n = new Scanner(System.in).nextInt();
		System.out.println("tong " +sum(n));
	}
	private static int sum(int n) {
		int sum = 0;
		if(n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				sum += i;
			}
		}else {
			for (int i = 1; i <= n; i += 2) {
				sum += i;
			}
		}
		return sum;
	}
}
