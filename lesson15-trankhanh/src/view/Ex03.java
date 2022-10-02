package view;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so:");
		int number = sc.nextInt();
		int result = number;
		while (result != 1 && result != 4) {
			result = NumberHappy(result);
		}
		if (result == 1) {
			System.out.println("La so hanh phuc ");
		} else {
			System.out.println("Khong phai la so hanh phuc ");
		}
	}

	public static int NumberHappy(int number) {
		int tmp = 0, sum = 0;
		while (number > 0) {
			tmp = number % 10;
			sum = sum + (tmp * tmp);
			number = number / 10;
		}
		return sum;
	}

}
