package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		long m=15;
		long n=75; 
		
		
		
	}

	private static boolean checkPrimeNumber(long x) {
		if (x < 2) {
			return false;
		}
		for (long i = 2; i < x / 2; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
}
