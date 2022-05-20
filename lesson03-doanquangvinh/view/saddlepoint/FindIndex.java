package saddlepoint;

import java.util.Scanner;

public class FindIndex {
	private static Scanner ip = new Scanner(System.in);
	private static int a;
	private static int b;

	public static void main(String[] args) {
		System.out.print("Enter the number of rows :");
		a = ip.nextInt();
		System.out.print("Enter the number of comlumns :");
		b = ip.nextInt();
		int[][] array = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("Enter the value " + "i[" + i + "]" + "j[" + j + "]:");
				array[i][j] = ip.nextInt();

			}
		}
		System.out.println("the elements in the array");
		for (int i = 0; i < a; i++) {
			System.out.println();
			for (int j = 0; j < b; j++) {
				System.out.print(array[i][j] + "  ");
			}

		}
		findSaddlePoint(array);

	}

	private static void findSaddlePoint(int[][] array) {
		int max = array[0][0];
		int min = array[0][0];
		int count = 0;
		for (int i = 0; i < a; i++) {
			min = array[i][0];
			for (int j = 0; j < b; j++) {
				if (min > array[i][j]) {
					min = array[i][j];
					count++;
// Tới đây em hết bí mất rồi a Quyền ơi :v
				}
			}
		}
	}
}
