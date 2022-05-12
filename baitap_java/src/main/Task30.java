package main;

import java.util.Scanner;

public class Task30 {
	public static void main(String[] args) {
		int a;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên ");
		a = sc.nextInt();
		for (int i = 1; i <= a/2; i++) {
			if (a % i == 0)
				sum = sum + i;

		}
		System.out.println(sum);
		if(a == sum) {
			System.out.println(a + " Là số hoàn hảo");
		} else {
			System.out.println(a + " Không phaỉ là số hoàn hảo");
		}

	}
}
