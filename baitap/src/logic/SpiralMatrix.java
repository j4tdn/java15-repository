package logic;

import java.util.Iterator;
import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {
		System.out.println("enter n");
		int n = new Scanner(System.in).nextInt();
		int[][] numbers = new int[n][n];
		int h1 = 0;
		int h2 = n-1;
		int c1 = 0;
		int c2 = n-1;
		int count = 0;
		while(h1 <= h2 && c1 <= c2) {
			for (int i = c1; i <= c2; i++) {
				numbers[h1][i] = count++;
				
			}
			h1++;
			for (int i = h1; i <= h2; i++) {
				numbers[i][c2] = count++;
			}
			c2--;
			for (int i = c2; i >= c1; i--) {
				numbers[h2][i] = count++;
			}
			h2--;
			for (int i = h2; i >= h1; i--) {
				numbers[i][c1] = count++;
			}
			c1++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(numbers[i][j] + "  ");
			}
			System.out.println();
			System.out.println();
		}
	}
	private static boolean isPimeNumber(int number) {
		if(number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
