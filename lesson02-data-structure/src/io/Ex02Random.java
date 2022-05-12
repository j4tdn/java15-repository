package io;

import java.util.Random;

/**
 * 1. Random a number from less than N ( 0 -> N ) 
 * 2. Random a number from a to b
 * 3. Random an element in a list
 */
public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();

		// 0-10
		int number = rd.nextInt(10);
		System.out.println("Random number: " + number);

		// 26-34
		int digit = rd.nextInt(26, 34);
		System.out.println("Random digit: " + digit);
		
		String[] letters = {"A", "B", "C", "D", "E"}; 
		int length = letters.length;
		System.out.println("Value: " + letters[2]);
		String letter = letters[rd.nextInt(length)];
		System.out.println("Randome letter: " + letter);
		
		for(int i =1; i <= 10; i++) {
			System.out.print(letters[rd.nextInt(length)]);
		}

	}
}
