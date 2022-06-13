package baitaplogic;

import java.util.Scanner;

public class TimUoc {
	public static void main(String[] args) {
		System.out.println("nhap n");
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		for (int i = 1; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
			
		}
		System.out.println("");
		System.out.println(n+ " có " + count + " ước");
	}
}
