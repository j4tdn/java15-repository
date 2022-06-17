package loop;

import java.util.Scanner;

public class Ex03validator {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter number: ");

		String numberAsText = " ";
		int incorrectInputAmount = 0;

		// chưa phải là số
		do {
			// cho nhập lại đến lúc nào là số thì dừng
			System.out.println("Invalid number - Enter again: ");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("\\d+")) {
				break;
			}
			incorrectInputAmount++;
			if (incorrectInputAmount == 3) {
				System.out.println(" đã quá 3 lần ");
				System.out.println("exit");
				System.exit(0);
			}

		} while (numberAsText.matches("\\d+"));

		int number = Integer.parseInt(ip.nextLine());

		System.out.println("========================");
		System.out.println("Value: " + number);
	}
}
