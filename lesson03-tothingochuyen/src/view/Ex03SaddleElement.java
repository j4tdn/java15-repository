package view;

import java.util.Scanner;

public class Ex03SaddleElement {
	private static int row;
	private static int column;
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//nhập kích thước hàng và cột
		do {
		System.out.println("Enter array size:");
		System.out.print("Row: ");
		row = input.nextInt();
		System.out.print("Column: ");
		column = input.nextInt();
		} while (row <= 1 || column <= 1);
		
		int[][] a = new int [row][column];
		
		//nhập giá trị cho hàng và cột
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print("Enter element [ " + i + ", " + j + "]: ");
				a[i][j] = input.nextInt();
			}
			System.out.println();
		}
		System.out.println("========================");
		
		//in bảng
		System.out.println("Table size: " + row + " X " + column);
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		
		int[] minRow = new int[row];
		int[] maxColumn = new int[column];
		
		//tim gia tri min trong row
		for (int i = 0; i < row; i++) {
			minRow[i] = 0;
			int min = a[i][0];
			for(int j = 1; j < column; j++) {
				if(min > a[i][j]) {
					min = a[i][j];
					minRow[i] = j;
				}
			}
			System.out.println("Min Row " + (i + 1) + ": " + min);
		}
		
		//tim gia tri max trong column
		for (int j = 0; j < column; j++) {
			maxColumn[j] = 0;
			int max = a[0][j];
			for(int i = 0; i < row; i++) {
				if(max < a[i][j]) {
					max = a[i][j];
					maxColumn[j] = i;
				}
			}
			System.out.println("Max Column " + (j + 1) + ": " + max);
		}
		
		System.out.println("=============================");
		
		//kiểm tra xem có phần tử yên ngựa không
		int count = 0;
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				if((i == maxColumn[j]) && (j == minRow[i])) {
					System.out.println("Saddle element: " + a[i][j]);
					count++;
				}
			}
		}
		
		if(count == 0) {
			System.out.println("No saddle element!");
		}
	}
}
