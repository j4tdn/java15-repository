package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap n:");
		int n = Integer.parseInt(scanner.nextLine());
		triangle(n);
	}

	private static void triangle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((j > i && j < (n - 1 - i)) || (j > (n - 1 - i) && j < i)) {
					System.out.printf("   ");
				} else {
					System.out.printf("%02d ",j + 1);
				}
			}
			System.out.println();
		}
	}
}
