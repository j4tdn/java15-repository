package view;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int sum = 0;
		System.out.println("number to converted: ");
		int n = ip.nextInt();
		do {
			
			sum = sum * 10 + n % 2;
			n /= 2;
		} while (n > 0);
		System.out.println("equal:" + sum);

	}
}
