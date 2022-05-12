package view;

import java.util.Scanner;

public class Ex03SymmetricalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần kiểm tra: ");
		int input = sc.nextInt();
		
		int x=input;
		int y=0;
		
		while(x != 0 ) {
			int reversed = x % 10;
			y = y * 10 + reversed;
			x /= 10;
		}
		
		if (input == y) {
			System.out.println(input+" là số đối xứng.");
		} else {
			System.out.println(input+" không phải là số đối xứng.");
		}
	}
}
