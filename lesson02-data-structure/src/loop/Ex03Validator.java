package loop;

import java.util.Scanner;

public class Ex03Validator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		do {
			System.out.println("Enter Valid Number");
			numberAsText = ip.nextLine();

		} while (!numberAsText.matches("\\d+"));
		int number = Integer.parseInt(numberAsText);

		System.out.println("========");
		System.out.println("Value: " + number);

	}
}
