package view;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

public class Ex01Converter {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter candidate birthyear");
		
		String yearAsString = ip.nextLine();
		
		while(true) {
			yearAsString = ip.nextLine();
			if(yearAsString.matches("[\\d]+")) {
				break;
			}
			System.out.println("Invalid");
			
		}
		
		Integer birthYear = Integer.parseInt(yearAsString);
		
		System.out.println("Year: " +birthYear);
		
		System.out.println("Age :" +( Year.now().getValue() - birthYear));
	}
	
	private static boolean isValidStringAsNumber(String text) {
		for (char )
	}
}
