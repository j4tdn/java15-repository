package loop;

import java.util.Scanner;

public class Ex03Validator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		// Validation
		String numberAsText = "";
		int incorrectInputAmount = 0;
		do {
			System.out.print("Enter valid number: ");
			numberAsText = ip.nextLine();
			
			if (numberAsText.matches("\\d+")) {
				break;
			}
			
			incorrectInputAmount++;
			if (incorrectInputAmount == 3) {
				System.out.println("\n>>Wrong input amount exceeds 3 times");
				System.out.println("Exit");
				System.exit(0);
			}
			
		} while(true);
		
		int number = Integer.parseInt(numberAsText);
		
		System.out.println("===========");
		System.out.println("Value: " + number);
	}
}
