package loop;

import java.util.Scanner;

public class Ex03Validator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int incorretInputAmount = 0;
		String numberAsText = "";
		do {
			System.out.println("Enter valid number: ");
			numberAsText = ip.nextLine();
			
			if(numberAsText.matches("\\d+")) {
				break;
			}
			incorretInputAmount++;
			if(incorretInputAmount == 3) {
				System.out.println("Wrong inpuut amount excedds 3 times");
				System.out.println("Exit");
				System.exit(0);
			}
		}
		while(true );
		int number = Integer.parseInt(numberAsText);
		
		System.out.println("==================");
		System.out.println("Value: " + number);
		
	}
}
