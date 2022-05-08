package io;

import java.util.Random;

/**
 * 1. Random a number less than N ( 0-> N) 2. Random a number from A to B 3.
 * Random an element int list
 */
public class Ex02Random {

	public static void main(String[] args) {
		//for ( int i= 0 ; i < 10 ; i++) {
		Random rd = new Random();
		int number = rd.nextInt(10);
		System.out.println(number);
		
		// random 26-->37
		//int digit = rd.nextInt(26, 37);
		int digit = 26 + rd.nextInt(34-26+1);
		System.out.println(digit);
		String[] letters = { "A", "B", "C", "D", "E"};
		int length = letters.length;
		System.out.println("Chu : " + letters[0]);
		String letter = letters[0 + rd.nextInt(length)];
		System.out.println("random chu:" + letter);
		
		for ( int i = 1 ; i< 10; i++ ) {
			System.out.println( i + ": " +letters[0 + rd.nextInt(length)]);
		}
	}

}
