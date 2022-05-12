package homework;

import java.util.Random;

public class Task05Binary {
	public static void main(String[] args) {
		int number = new Random().nextInt(100000);
		System.out.println("number: " +number);
		System.out.println("number convert binary: " +convertBinary(number));
	}
	public static String convertBinary(int x) {
		
		String binary = "";
		while (x > 0) {
		binary += (x % 2);
		x /= 2;
			
		}
		return binary;
	}
}
