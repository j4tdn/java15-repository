package saddlepoint;

import java.io.*;

import java.util.Random;
import java.util.Scanner;

public class SaddlePointMatrix {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("Nhap so dong");
		int r = sc.nextInt();
		System.out.println("Nhap so cot");
		int c = sc.nextInt();
		int[][] array = new int[r][c];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = 1 + rd.nextInt(99);
			}
		}

		System.out.println(array[r][c] + "  ");

		for (int i = 0; i < array.length; i++) {
			int svj = 0;
			for (int j = 1; j < array[i].length; j++) {
				if (array[i][j] < array[i][svj]) {
					svj = j;
				}
			}
			boolean flag = true;
			for (int k = 0; k < array.length; k++) {
				if (array[k][svj] > array[i][svj]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				
				System.out.println("So Yen Ngua"+ array[i][svj]);
				return;
			}
		}
		
	}

}
