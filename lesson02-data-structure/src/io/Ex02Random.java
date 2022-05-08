package io;

import java.util.Random;

/**
 * 
 * 1.Random a number less than N 2.Random a number from A to B 3.Random an
 * element in a list
 */
public class Ex02Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int num = rd.nextInt(25, 35);
		System.out.println("Random number: " + num);
		/**
		 * int digit = A + rd.nextInt(B-A+1)
		 */

		String[] letters = { "A", "B", "C", "D", "E" };
		String letter = letters[0 + rd.nextInt(letters.length)];
		System.out.println(letter);
//		int length = letters.length;
		
		for(int i = 0; i<=100; i++) {
			System.out.println(i + ":" + letters[rd.nextInt(letters.length)]);
		}
		
	}
}
