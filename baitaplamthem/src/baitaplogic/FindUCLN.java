package baitaplogic;

import java.util.Scanner;

public class FindUCLN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập b ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("ước chung lớn nhất của a và b : " +findUcln(a, b));
		System.out.println("bôi chung nhỏ nhất của a và b :" + (a * b) / findUcln(a, b));
	}
	private static int findUcln(int a, int b) {
		while(a != b) {
			if(a > b) {
				a -= b;
			}else {
				b -= a;
			} 
		}
		return a;
	}
}
