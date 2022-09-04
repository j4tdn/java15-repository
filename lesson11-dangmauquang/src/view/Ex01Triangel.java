package view;

import java.util.Scanner;

public class Ex01Triangel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= 2*n - 1; i++) {
			for(int j = 1; j <= 2*n -1; j++) {
				System.out.print(j);	
			}
			System.out.println();
		}
	}
}
