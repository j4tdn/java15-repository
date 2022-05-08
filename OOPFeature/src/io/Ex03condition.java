package io;

import java.util.Random;

/**
 * 1. KIểm tra 1 số chẳn hay lẻ
 * 2. kiểm tra 1 số chia hết cho 5
 **/

public class Ex03condition {
    public static void main(String[] args) {
        Random rd = new Random();

        int number = rd.nextInt(5);
        System.out.println("number : " + number);
        //1.
        if (number % 2 == 0) {
            System.out.println("number 2: " + number);
        } else {
            System.out.println("number 2odd: " + number);
        }

        //2.

        if (number % 5 == 0) {
            System.out.println("number: " + number);
        } else {
            System.out.println("number false 5: " + number);
        }

    }
}
