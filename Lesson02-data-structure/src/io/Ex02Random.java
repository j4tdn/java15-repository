package io;

import java.util.Random;

/**
 * 
 * @author MSI GL65 1.Random a number less than N 2. Random a number from a to b
 *         3. Random an element in a list
 */
public class Ex02Random {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Random rd = new Random();
         rd.nextInt(10);
         int number = rd.nextInt(10);
         System.out.println("Random number : " + number);
         //26-34
         int digit = rd.nextInt(26, 34);
         // int digit = 26 + rd.nextInt(34-26+1);
         System.out.println("Random number :  " + digit);
         System.out.println("==============================");
         
         String[] letters = {"A","B","C","D","E"};
         System.out.println("Value at index:" + letters[2]);
         String letter = letters[rd.nextInt(letters.length)];
         System.out.println(" Random letter:" + letter);
         for(int i =1; i <= 10; i++) {
        	 System.out.println(i + ": " + letters[rd.nextInt(letters.length)]);
         }
	}

}
