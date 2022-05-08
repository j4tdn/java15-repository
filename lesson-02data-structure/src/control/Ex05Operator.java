package control;

import java.util.Random;

public class Ex05Operator {
	public static void main(String[] args) {
		int number = new Random().nextInt(10);
		boolean issOdd = number % 2 != 0;
		String text = number % 2 != 0 ? "SO le" : "So chan";
		System.out.println(issOdd);
		System.out.println(text);
	}
}
