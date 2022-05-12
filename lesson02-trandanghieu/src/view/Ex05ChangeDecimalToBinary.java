package view;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05ChangeDecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so thap phan: ");
		int decimalNumber = sc.nextInt();
		ChangeToBinary(decimalNumber);
	}

	private static void ChangeToBinary(int number) {
		String binary="";
		while(number>0) {
			binary=(number%2) + binary;
			number=number/2;
		}
		System.out.println(" So Nhi Phan:"+ binary);
	}
}
