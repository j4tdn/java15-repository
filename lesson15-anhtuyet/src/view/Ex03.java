package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập một số dương khác 0:");
		int number = sc.nextInt();
		int result = number;
		while (result != 1 && result != 4) {
			result = checkHappyNumber(result);
		}
		if (result == 1) {
			System.out.println("Là số hạnh phục");
		} else {
			System.out.println(" Không phải là số hạn phúc");
		}
	}
	public static int checkHappyNumber(int number) {
		int a = 0, sum = 0;
		// calculate the sum of squares of each digits
		while (number > 0) {
			a = number % 10;
			sum = sum + (a * a);
			number = number / 10;
		}
		return sum;
	}
}
