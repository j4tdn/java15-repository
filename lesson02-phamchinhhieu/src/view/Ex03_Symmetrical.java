package view;

import java.util.Scanner;

public class Ex03_Symmetrical {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("========KIEM TRA SO DOI XUNG==========");
		System.out.print("Nhap so: ");
		int n = ip.nextInt();
		if(Symmetrical(n) == true) {
			System.out.println("So " + n + " la so doi xung");
		}
		else {
			System.out.println("So " + n + " khong phai la so doi xung");

		}
	}
	private static boolean Symmetrical(int number) {
		int temp = 0;
		int value = number;
		while(number > 0) {
			temp = temp * 10 + number % 10;
			number = number / 10;
		}
		if(temp == value) {
			return true;
		}
		return false;
		
	}
}
