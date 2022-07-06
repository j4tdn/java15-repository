package ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int number1 = 0, number2 = 0;
		int x =0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("input a: ");
				number1 = Integer.parseInt(scanner.nextLine());
				System.out.println("input b: ");
				number2 = Integer.parseInt(scanner.nextLine());
				x = -number2 / number1;
				break;
			} catch (Exception e) {
				System.out.println("invalid number");
			}
		} while (true);
		
		System.out.println("X : " + x);

	}
}
