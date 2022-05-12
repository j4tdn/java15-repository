package view;

import java.util.Scanner;

public class Ex03SymmetricalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số: ");
		int n = sc.nextInt();
		
		int check = symmetrical_num(n);
		if (check == 1) 
			System.out.println(n + " là số đối xứng");
		else 
			System.out.println(n + " không phải là số đối xứng");
	}
	private static int reserve_num(int n) {
		int reserve = 0;
		while (n > 0) {
			reserve = reserve * 10 + n % 10;
			n /= 10;
			
		}
		return reserve;
	}
	private static int symmetrical_num (int n) {
		int flag = 0;
		if (reserve_num(n) == n) flag = 1;
		return flag;
	}
}
