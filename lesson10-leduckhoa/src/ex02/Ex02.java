package ex02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Mời nhập số hàng");
		int i = ip.nextInt();
		System.out.println("Mời nhập số cột");
		int j = ip.nextInt();
		int[][] a = new int[i][j];
		for(int h = 0; h < i;h++) {
			for(int k = 0; k< j;k++) {
				System.out.print("a["+h+"]["+k+"]:");
				a[h][k] = ip.nextInt();
			}
		}
		for(int h = 0; h < i;h++) {
			for(int k = 0; k< j;k++) {
				if(a[h][k] == 0) {
					for(int c = 0; c < i;c++) a[c][k] = 0;
					for(int c = 0; c < j;c++) a[h][c] = 0;
					k=j;
					h=i;
				}
			}
		}
		for(int h = 0; h < i;h++) {
			for(int k = 0; k< j;k++) {
				System.out.print(a[h][k] + " " );
			}
			System.out.print("\n");
		}
		
		
		
	}
}
