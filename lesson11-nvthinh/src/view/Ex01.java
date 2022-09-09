package view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("nhap n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int numbers[][] = new int[n][n];
		println(numbers);

	}

	public static void println(int array[][]) {
		int y = array.length - 1;
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = j + 1;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (j <= x || j >= y) {
					System.out.print(array[i][j] + " ");
				}

				else {
					System.out.print("  ");
				}
			}
			if (i < array.length / 2) {
				x++;
				y--;
			} else {
				x--;
				y++;
			}
			System.out.println();
		}
	}

}