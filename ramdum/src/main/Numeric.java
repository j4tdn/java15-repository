package main;

import java.util.Scanner;

public class Numeric {
	public static void main(String[] args) {
		int exp;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap diem kinh nghiem");
		exp = sc.nextInt();
		int salary = exp > 5 ? 1000 : 4000;
		System.out.println("luong cua ban la: "+salary);
	}

}
