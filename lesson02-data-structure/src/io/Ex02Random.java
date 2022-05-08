package io;

import java.util.Random;

/**
 * 1. Random a number less than N ( 0 ->N)
 * 2. Random a number from A to B
 * 3. Random an element in a list
 * new: khởi tạo đối tưởng ô nhớ ở HEAP
 */
public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int number = rd.nextInt(10);
		System.out.println("Random number: " + number);
	
		int digit = rd.nextInt(25, 34);
		System.out.println("Random number: " + digit);
		
		String [] letters = {"A", "B", "C", "D", "E", "F", "K"};
		int length = letters.length;
		//System.out.println("Value at index " + letters[2]);
		String letter = letters[0 + rd.nextInt(length)];
		System.out.println("Random letter: " + letter);
		for (int i = 1; i<=100; i++) {
			System.out.println(i + ": " + letters[0 + rd.nextInt(length)]);
		}
	}

}
