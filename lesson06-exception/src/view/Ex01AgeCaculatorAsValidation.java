package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCaculatorAsValidation {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		
	String yearAsString = null;
		do {
		System.out.println(" enter birth year");
		yearAsString = ip.nextLine();
		if(yearAsString.matches("\\d+")) {
			break;
		}
		System.out.println("inValid number !!!!!");
		}while(true);
		int year = Integer.parseInt(yearAsString);
		
		int age = Year.now().getValue() - year;
		
		System.out.println("Age " + age);
	}
}
