package io;

import java.util.Random;

/**
 * 1. Random a number less than N
 * 2. Random a number from A to B
 * 3. Random an element in a list
 */
public class Ex02Random {

	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(10);
		System.out.println("Random number: "+ number);
		int digit =26 + rd.nextInt(34-26+1);
		System.out.println("Random digit: "+digit);
		
		String[] letters = {"A","B","C","D","E"};
		//System.out.println("Value at index 2: "+letters[2]);
		String letter = letters[rd.nextInt(letters.length)];
		System.out.println("Random letter: "+letter);
		
		for(int i = 1; i<= 100; i++) {
			System.out.println(letters[rd.nextInt(letters.length)]);
			
		}
	}

}
