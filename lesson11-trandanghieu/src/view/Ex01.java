package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập n:");
		
		int n = ip.nextInt();
		
		int x = 2 * n - 1;

		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			int m = 2 * (n - i) - 1;
			
			for (int k = 1; k <= m; k++) {
				System.out.print(" ");
			}
			
			for (int t = x - i + 1; t <= x; t++) {
				System.out.print(t);
			}
			System.out.print("\n");
		}
		
		
		for (int a = 1; a <= x; a++) {
			System.out.print(a);
		}
		
		System.out.print("\n");
		
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			int m = 2 * (n - i) - 1;
			
			for (int k = 1; k <= m; k++) {
				System.out.print(" ");
			}
			
			for (int t = x - i + 1; t <= x; t++) {
				System.out.print(t);
			}
			System.out.print("\n");
		}
	}
}
