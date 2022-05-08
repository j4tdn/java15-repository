package loop;

import java.util.Scanner;

public class Ex03Validator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = " ";
		int incorrectAmount = 0;
		do {
			System.out.println("Enter valid number :");

			numberAsText = ip.nextLine();
			if (numberAsText.matches("\\d+")) {
				break;
			}
			incorrectAmount++;
			if (incorrectAmount == 3) {
				System.out.println("\n Wrong input amount exceed 3 times");
				System.out.println("Exit");
				System.exit(incorrectAmount);
			}
		} while (true);

		int number = Integer.parseInt(ip.nextLine());
		System.out.println("Value :" + number);
	}
}
