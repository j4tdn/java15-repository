package io;

import java.util.Random;

/**
 * 1.Ramdom a number less than N
 * 2. Random a number from a to b
 * 3. Random an element in a list
 */
public class Ex02Random {
	public static void main(String[] args) {
		Random rd= new Random();
		//0-10
		int number =rd.nextInt(10);
		System.out.println("Random number: " + number);
		// 26-34
		int digit =rd.nextInt(26, 34);
		System.out.println("Random number: " + digit);
		String[] letters= {"A", "B", "C", "D", "E", "F", "K"};
		int length = letters.length;
		String letter = letters[rd.nextInt(length)];
		System.out.println("random letter: " + letter);
		for(int i=1; i<=10; i++)
		{
			System.out.println(i +": " + letters[rd.nextInt(length)]);
		}
	}
}
