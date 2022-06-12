package view;

import java.util.Scanner;

public class Ex02IsSpecialNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number :");
		int S = ip.nextInt();
		
		System.out.println("The number that you enter is " + checkValidNumber(S));
	}

	public static boolean checkValidNumber(int S) {
		int n = 0;
		for (int i = 1; i <= S; i++) {
			n += i;
			System.out.print(i + " ");
			if (n == S) {
				System.out.println();
				return true;
			}
			
		}

		return false;
	}
}
