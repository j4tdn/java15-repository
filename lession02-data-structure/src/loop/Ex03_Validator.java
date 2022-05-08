package loop;

import java.util.Scanner;

public class Ex03_Validator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = "null";
		int incorectInputAmoun = 0;
		int nhapsai =-1;
		do {
			System.out.print("Enter valid number: ");
			numberAsText = ip.nextLine();
			nhapsai++;
			incorectInputAmoun++;
//			if(incorectInputAmoun == 3) {
//				System.out.println("Exit");
//				System.exit(0);
//			}
			System.out.println("nhapsai = "+ nhapsai);
			if(nhapsai == 2 && !numberAsText.matches("\\d+")) {
				System.out.println("exit");
				System.exit(0);
			}
		} while (!numberAsText.matches("\\d+"));

		int number = Integer.parseInt(numberAsText);
		System.out.println("Value: " + number);
	}
}
