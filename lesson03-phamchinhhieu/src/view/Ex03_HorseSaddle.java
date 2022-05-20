package view;

import java.util.Scanner;

public class Ex03_HorseSaddle {
	public static void main(String[] args) {
		int row, column;
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap mang có kich thuoc m *n");
		do {
			System.out.print("So hang: ");
			row = ip.nextInt();
			ip.nextLine();
			System.out.print("So cot: ");
			column = ip.nextInt();
			ip.nextLine();
		} while (row < 1 || column < 1);
		int a[][] = new int[row][column];
		input(row, column, a);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j] + "    ");
			}
			System.out.println();
		}
		System.out.println(check(a, row, column));

	}

	public static void input(int r, int c, int a[][]) {
		Scanner ip = new Scanner(System.in);
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = ip.nextInt();
			}
		}
	}

	public static boolean check(int a[][], int r, int c) {
		int min[] = new int[a.length];
		int temp[] = new int[a.length];
		int max[] = new int[a.length];
		int count = 0;
		for (int i = 0; i < r; i++) {
			min[count] = a[i][0];
			for (int j = 0; j < c; j++) {
				if (a[i][j] < min[count]) {
					min[count] = a[i][j];
					temp[count] = j;
				}
			}
			count++;
		}
		count = 0;
		for (int i = 0; i < c; i++) {
			max[count] = a[count][temp[count]];
			for (int j = 0; j < c; j++) {
				if (a[j][temp[count]] > max[i]) {
					max[i] = a[j][temp[count]];
				}
			}
			count++;
		}
		for (int i = 0; i < count; i++) {
			System.out.println("min = " + min[i]);
			System.out.println("max = " + max[i]);
		}
		for (int i = 0; i < r; i++) {
			if (min[i] == max[i]) {
				return true;
			}
		}
		return false;
	}

}
