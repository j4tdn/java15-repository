package io; 

import java.util.Random;

/**
 * 
 * @author ADMIN
 *
 */
public class Ex02Random {
public static void main(String[] args) {
	Random rd = new Random();
	int number = rd.nextInt(10);
System.out.println("Random number:"+ number);
	int digit = 26 + rd.nextInt(34-26+1);
	System.out.println("Ramdom digit: " + digit);
	String[] letters = {"A", "B", "C", "D", "E", "F", "K"};
	System.out.println("Random letter:" + letters[rd.nextInt(letters.length)]);
	for(int i = 1; i<= 100; i++) {
		System.out.println(i + ": "+ letters[rd.nextInt(letters.length)]);
	}
}
}
