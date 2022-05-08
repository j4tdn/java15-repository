package loop;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in); 
		String numberAsText = "";
		
		do {
			System.out.println("Enter valid number:");
			numberAsText = ip.nextLine();
			
		}
		while (!numberAsText.matches("\\d+"));
		
		int number = Integer.parseInt(numberAsText);
		
		System.out.println("============");
		System.out.println("Value: " + number);
	}

}
