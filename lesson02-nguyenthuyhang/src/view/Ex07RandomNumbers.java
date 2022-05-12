package view;

import java.util.Random;

public class Ex07RandomNumbers {
	public static void main(String[] args) {
		Random rd = new Random();
		int min = 20;
		int max = 30;
			System.out.println("Random value from "+min+" to "+max+ ":");
	      int random_int = (int)(Math.random() * (max - min + 1) + min);
	      System.out.println(random_int);
	}
	
}
