package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = 5;  int n = 4;
		int a[][] = { { 1, 2,3,4 }, { 5,0,8,7 }, { 1,9,0,9}, {2,0,6,5},{1,3,4,5}};
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int aa[] = elementszero(a, m, n);
		System.out.println(Arrays.toString(aa));
		asadf(a, aa, m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int[] elementszero(int[][] a, int m, int n) {
		int count = 0;
		int[] z = new int[100];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == 0) {
					z[count++] = i;
					z[count++] = j;
				}
			}
		}
		return Arrays.copyOfRange(z, 0, count);

	}

	private static void asadf(int[][] a, int[] aa, int m,int n) {
		int count = 0;
		while(count < aa.length) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][aa[count+1]] = 0;
					a[aa[count]][j] = 0;
				}
			}
			count+=2;
		}
		

	}
}
