package ex03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int size;
		System.out.println("nhap n: ");
		size = ip.nextInt();
		printPascalTr(size);
	}

	public static void printPascalTr(int size) {
		int[][] PascalTr = new int[size][size];
		int row, col;
		for (row = 0; row < size; row++)
			for (col = 0; col < size; col++)
				PascalTr[row][col] = 0;
		PascalTr[0][0] = 1;
		PascalTr[1][0] = 1;
		PascalTr[1][1] = 1;
		for (row = 2; row < size; row++) {
			PascalTr[row][0] = 1;
			for (col = 1; col <= row; col++) {
				PascalTr[row][col] = PascalTr[row - 1][col - 1] + PascalTr[row - 1][col];
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (PascalTr[i][j] > 0) {
					System.out.print(PascalTr[i][j] + "		");
				}
			}
			System.out.println();
			System.out.println();
		}
	}
}