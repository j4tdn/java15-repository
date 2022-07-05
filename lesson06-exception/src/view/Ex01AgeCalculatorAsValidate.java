package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsValidate {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		String bYearAsString = null;
		// validate
		do {
			System.out.print("Enter birth year: ");
			bYearAsString = ip.nextLine();
			if (bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println("Invalid number ");
		} while (true);
		// passed validation

		int byear = Integer.parseInt(bYearAsString);

		int age = Year.now().getValue() - byear;
		System.out.println("Age: " + age);
	}
}
