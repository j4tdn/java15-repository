package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n = Integer.parseInt(ip.nextLine());
		int m = Integer.parseInt(ip.nextLine());
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = ip.nextInt();
			}
		}
		process(a, n, m);
	}

	private static void process(int[][] a, int n, int m) {
		int target1 = 0, target2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 0) {
					target1 = i;
					target2 = j;
				}
			}
		}
		System.out.println("===================================");
		for (int i = 0; i < m; i++) a[target1][i] = 0;
		for (int j = 0; j < n; j++) a[j][target2] = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			    System.out.print("\n");
		}
	}
}
