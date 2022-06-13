package baitaplogic;

import java.util.Random;

public class TongDaySoo {
	public static void main(String[] args) {
		int n;
		System.out.println(n = new Random().nextInt(100000, 2000000));
		System.out.println("tổng các số của " + n + " :" +sum(n));
	}
	private static int sum(int n) {
		int sum = 0;
		while(n > 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}
}
