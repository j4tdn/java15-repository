package io;

import java.util.Random;

/**
 * 1. Random number less than N
 * 2. Random a number from A to B
 * 3. Random an element in a list
 */
public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//0-10
		int number = rd.nextInt(10);
		System.out.println("Random number: " + number);
		
		//26-34 ==> A + rd.nextInt(B-A+1)
		int digit = 26 + rd.nextInt(34-26+1);
		System.out.println("Random number: " + digit);
		
		String[] letters = {"A", "B", "C", "D", "E", "F", "K"};
		int length = letters.length;
		//System.out.println("Value at index 2: " + letters[2]);
		String letter = letters[rd.nextInt(length)];
		System.out.println("Random letter: " + letter);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + ": " + letters[rd.nextInt(length)]);
		}
	}
}
