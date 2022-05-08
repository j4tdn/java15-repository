package Homework_Lesson2;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Nhập số: ");
		int number = Integer.parseInt(ip.nextLine());
		if (isPowerOfTwo(number) == true) {
			System.out.println(number + " Là lũy thừa của 2");
		} else {
			System.out.println(number + " Không phải Là lũy thừa của 2");
		}

	}

//	private static boolean isPowerOfTwo(int n) {
//		return ((n!=0) && (n&(n-1))==0);
//	}
	private static boolean isPowerOfTwo(int n) {
		if (0 == n || 1 == n)
			return true;
		int x = n / 2;
		int y = n % 2;
		if (1 == y) {
			return false;
		} else {
			return isPowerOfTwo(x);
		}
	}
}
