package loop;

import java.util.Scanner;

public class Ex03Validator {
public static void main(String[] args) {
	Scanner ip = new Scanner(System.in);
	
	// Validation
	String numberAsText = "";
	int incorrectInputAmout = 0;
	do {
		System.out.println("Enter valid number: ");
		numberAsText = ip.nextLine();
		
		if (numberAsText.matches("))
		incorrectInputAmout++;
		if (incorrectInputAmout == 3) {
			System.out.println("\n>>Wrong input amout exceeds 3 times");
			System.out.println("Exit");
			System.exit(0);
		}
	} while(true);
	int number = Integer.parseInt(numberAsText);
	
	System.out.println("========");
	System.out.println("Value: " + number);

}
}
