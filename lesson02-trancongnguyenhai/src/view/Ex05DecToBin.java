package view;

import java.util.Random;
import java.util.Scanner;

public class Ex05DecToBin {
	public static void main(String[] args) {
		Random rd = new Random();
		System.out.print("Input: ");
		int num = rd.nextInt(100);
		System.out.println(num);
		System.out.print("-->Output: ");
		decToMin(num);
	}

	private static void decToMin(int num) {
		if (num > 0) {
			decToMin(num / 2);
			System.out.print(num%2);
		}
	}
}
