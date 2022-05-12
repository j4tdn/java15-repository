package main;

import java.util.Scanner;

public class Task28 {
public static void main(String[] args) {
	int a, b, lcm;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập số a và b");
	a  =sc.nextInt();
	b = sc.nextInt();
	lcm = (a>b) ? a : b;
	while (true) {
		if(lcm % a == 0 && lcm % b == 0) {
			System.out.println("Bội chung nhỏ nhất của " +a+ " và "+b+ " là: " +lcm);
			break;
		}
		lcm++;
	}
}
}
