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
		// 0->10
		int number = rd.nextInt(10);
		System.out.println("Random number: "+number);
		// 26->34
		int digit = rd.nextInt(26,34);
		System.out.println(digit);
		
		String[] letters = {"A", "B", "C", "D", "E"};
		int i = letters.length;
		System.out.println(letters[rd.nextInt(i)]);
		for (int j=1; j<=100; j++) {
			System.out.println(j+": "+letters[rd.nextInt(i)]);
		}
	}	
}
