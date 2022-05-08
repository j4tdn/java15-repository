package io;
/**
 * 1. Random a number less than N(0 ->N)
 * 2. Random anumber from A to B
 * 3. Random an element in a list
 */
import java.util.Random;

public class Ex02_Random {
	public static void main(String[] args) {
		Random rd = new Random();
		//System.out.println(rd.nextInt(26, 34));	
		String[] letters = {"A", "B", "C", "D", "E"};
		int length = letters.length;
		String letter = letters[rd.nextInt(length)];
		System.out.println("Random letter:" + letter);
		for(int i =1; i <= 100; i++) {
			System.out.println(i + ": " + letters[rd.nextInt(length)]);
		}
	}
}
