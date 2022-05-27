package io;

import java.util.Random;

/**
 * 1. Random a n umber less than N
 * 2. Random a number from A to B
 * 3. Random an element in a list
 **/

public class Ex02Ramdom {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(10);
        System.out.println("Random number :" + number);

        int digit = rd.nextInt();

        String[] letter = {"a", "b", "c", "d", "e"};
        System.out.println(letter[2]);

        String letters = letter[rd.nextInt(letter.length)];
        System.out.println("letters : " + letters);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " : " + letter[rd.nextInt(letter.length)]);
        }
    }
}
