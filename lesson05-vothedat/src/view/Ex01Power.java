package view;

import java.util.Scanner;

public class Ex01Power {
	public static void main(String[] args) {
         Scanner ip = new Scanner(System.in);
         System.out.println("Nhập a: ");
         int a = Integer.parseInt(ip.nextLine());
         System.out.println("Nhập b: ");
         int b = Integer.parseInt(ip.nextLine());
         System.out.println(isPower(a,b));
	}
	
	private static boolean isPower(int a, int b) {
		double log = a > b ? Math.log(a)/Math.log(b) : Math.log(b)/Math.log(a);
		return Math.ceil(log) == Math.floor(log);
	}
}