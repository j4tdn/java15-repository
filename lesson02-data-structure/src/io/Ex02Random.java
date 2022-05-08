package io;

import java.util.Random;
import java.util.Scanner;

public class Ex02Random {
	public static void main(String[] args) {

		Random rd = new Random();

		int number = rd.nextInt(10);
		System.out.println("Random number: " + number);

		int digit = 26 + rd.nextInt(34 - 26 + 1);
		System.out.println("Random number: " + digit);

		String[] Letters = { "A", "B", "C", "D" };
		int length = Letters.length;

		String letter = Letters[rd.nextInt(length)];
		System.out.println("Ramdom Letter: " + letter);

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + ": " + Letters[rd.nextInt(length)]);
		}
	}
}
