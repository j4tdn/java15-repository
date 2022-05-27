package control;

import java.util.Random;

public class Ex05Operator {
    public static void main(String[] args) {
        // Syntax: expression ? stament1 : stament2
        /*
        if(expression){
            statement 1;
        }else{
            statement 2;
        }
         */

        //Odd number
        int number = new Random().nextInt(10);
        boolean isOdd = number % 2 != 0;
        String text = isOdd ? "số lẻ" : " số chẳn";
        System.out.println(number);
        System.out.println(text);

    }
}
