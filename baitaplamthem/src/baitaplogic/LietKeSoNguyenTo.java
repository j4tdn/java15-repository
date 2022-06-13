package baitaplogic;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class LietKeSoNguyenTo {
	public static void main(String[] args) {
		System.out.println("nhap n");
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		int i = 2;
		do {
			if(isPrimeNum(i)) {
				sleep(420);
				System.out.printf(i + " ");
				count++;
				
			}
			i++;
		}while(count < n);
	}
	
	private static boolean isPrimeNum(int n) {
		if(n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static void sleep(long millisecons) {
		try {
			TimeUnit.MILLISECONDS.sleep(millisecons);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
