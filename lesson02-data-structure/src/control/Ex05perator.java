package control;

import java.util.Random;

public class Ex05perator {
     public static void main(String[] args) {
     // Syntax: expression ? statement1 : statement 2
	 /*
	  *if (expression){{
	  *statement 1;
	  *} else {
	  *statement 1;
	  *}
	  */
    	
	  // Is Odd number
    	 int number = new Random().nextInt(10);
    	 boolean isOdd = number % 2 != 0;
    	 String text = number % 2 != 0 ? " So le" : " so chan";
    	 System.out.println("isOdd: " + isOdd);
    	 System.out.println("text: " + text);
	
}
}
