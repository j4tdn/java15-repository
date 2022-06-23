package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsValidation {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter birth year: ");

		String bYearAsString = ip.nextLine();
		while (true) {
			if (bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println(">>> Invalid number !!!");
			bYearAsString = ip.nextLine();
		}

		int bYear = Integer.parseInt(bYearAsString);

		int age = Year.now().getValue() - bYear;
		System.out.println("Age: " + age);
	}
}
