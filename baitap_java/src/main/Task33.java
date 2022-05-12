package main;

import java.util.Scanner;

public class Task33 {
public static void main(String[] args) {
	int n;
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhập số nguyên");
	n = sc.nextInt();
	sc.close();
	for (int i = 1; i < n; i++) {
		sum += i;
	}
	System.out.println("tông các số tự nhiên "+n+ " là "+sum);
}
}
