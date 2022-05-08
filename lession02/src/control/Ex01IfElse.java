package control;

import java.util.Random;

public class Ex01IfElse {

	public static void main(String[] args) {
		Random rd = new Random();
		// Kiem tra 1 so la chan hay le
		int a = 3  + rd.nextInt(5);
		
		System.out.println(" number :" + a);
		　int　number　= a % 2 == 0 ? "a là số chẵn" : "a là số lẻ";
		
		
		
	}

}
