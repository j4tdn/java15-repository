package saddleelement;

import java.util.Scanner;

public class Saddlee {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the row:");
		int row = ip.nextInt();
		System.out.print("Enter the column:");
		int col = ip.nextInt();
		int[][] matrix = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print("matrix[" + i + "][" + j + "]" + ":   ");
				matrix[i][j] = ip.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int a = matrix[i][j];
				if (check1(matrix, a, row, col,i) && check2(matrix, a, row, col,j)) {
					System.out.println(a + " là phần tử yên ngựa");
				}
			}
		}

	}

	public static boolean check1(int matrix[][], int number, int row, int col , int h) {
		boolean result = true;
  int count = 0;
		for (int j = 0; j < col; j++) {
			if(number ==matrix[h][j] ) {
				count++;
				if(count==2) {
				result = false;
				break;
				}
				
			}
		else if (number <= matrix[h][j]) {
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}

	public static boolean check2(int matrix[][], int number, int row, int col ,int c) {
		boolean result = true;
   int count = 0;
		for (int i = 0; i < col; i++) {
			if(number ==matrix[i][c] ) {
				count++;
				if(count==2) {
				result = false;
				break;
				}
			}
				else if(number >= matrix[i][c]) {
				result = true;
			} else {
				result = false;
				break;
			}
		}
		return result;
	}
}
