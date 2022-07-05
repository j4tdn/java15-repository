package view;

import java.util.Scanner;

public class Ex04_ReadNumber {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		do {
			System.out.println("Nhap n: ");
			try {
				n = Integer.parseInt(sc.nextLine());
				if (check1(n))
					System.out.println(rNum(n));
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	private static boolean check1(int n) {
		if (n < 0 || n > 999) {
			throw new NumberFormatException("n thuộc [0,999]");
		}
		return true;
	}

	private static String rNum(int n) {
		String number = "";
		int[] a = new int[3];
		int i = 0;
		while (n > 0) {
			a[i] = n % 10;
			n = n / 10;
			i++;
		}
		switch (a[2]) {
		case 0:
			number = "";
			break;
		case 1:
			number = "Một Trăm ";
			break;
		case 2:
			number = "Hai Trăm ";
			break;
		case 3:
			number = "Ba Trăm ";
			break;
		case 4:
			number = "Bốn Trăm ";
			break;
		case 5:
			number = "Năm Trăm ";
			break;
		case 6:
			number = "Sáu Trăm ";
			break;
		case 7:
			number = "Bảy Trăm ";
			break;
		case 8:
			number = "Tám Trăm ";
			break;
		case 9:
			number = "Chín Trăm ";
			break;
		}
		switch (a[1]) {
		case 0:
			if (a[2] > 0 && a[0] > 0) {
				number += "Lẻ ";
			}
			else {
				number += "";
			}
			break;
		case 1:
			number += "Mười ";
			break;
		case 2:
			number += "Hai Mươi ";
			break;
		case 3:
			number += "Ba Mươi ";
			break;
		case 4:
			number += "Bốn Mươi ";
			break;
		case 5:
			number += "Năm Mươi ";
			break;
		case 6:
			number += "Sáu Mươi ";
			break;
		case 7:
			number += "Bảy Mươi ";
			break;
		case 8:
			number += "Tám Mươi ";
			break;
		case 9:
			number += "Chín Mươi ";
			break;
		}
		switch (a[0]) {
		case 0:
			if (a[1] > 0 && a[2] > 0 || a[1] == 0 && a[2] > 0 || a[1] > 0 && a[2] == 0) {
				number += "";
			}
			else {
				number += "Không";
			}
			break;
		case 1:
			number += "Một";
			break;
		case 2:
			number += "Hai";
			break;
		case 3:
			number += "Ba";
			break;
		case 4:
			number += "Bốn";
			break;
		case 5:
			if(a[2] > 0 && a[1] > 0 ||a[2] == 0 && a[1] > 0) {
				number += "Lăm";
			}
			else {
				number += "Năm";
			}
			break;
		case 6:
			number += "Sáu";
			break;
		case 7:
			number += "Bảy";
			break;
		case 8:
			number += "Tám";
			break;
		case 9:
			number += "Chín";
			break;
		}
		return number;

	}
}
