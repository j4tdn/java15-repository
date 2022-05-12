package view;

import java.util.Scanner;

public class Ex03SymmetricalNumber {

	public static void main(String[] args) {
		String x;
		System.out.println("Nhap n can kiem tra");
		int n = new Scanner(System.in).nextInt();
		int reversed = 0 , 	original ;
		original = n ;
		while(n != 0) {
		      int digit = n % 10;
		      reversed = reversed * 10 + digit;
		      n /= 10;
		    }
		x = (reversed == original) ? "n la so doi xung" : " n khong phai la so doi xung";
		System.out.println(x);
		
		
	}

}
