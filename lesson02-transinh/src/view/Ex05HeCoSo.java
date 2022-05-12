package view;

import java.util.Scanner;

public class Ex05HeCoSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần chuyển: ");
		int input = sc.nextInt();
		int sum = 0;
		int i = 1;
		do {
			int a = input % 2;
			sum = sum + (i * a);
			input = input / 2;
			i = i * 10;
		} while (input > 0);
		System.out.println("Số nhị phân là:" + sum);

	}
}
