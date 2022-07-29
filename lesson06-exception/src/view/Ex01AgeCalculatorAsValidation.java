package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsValidation {
	//Cách 1: Tiền xử lí
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter birth year: ");
		
		String bYearAsString = null;
		do {
			bYearAsString = ip.nextLine();
			if(bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println("Invalid number !!");
			
		}while(true);
		
		int year = Integer.parseInt(bYearAsString);
		
		int age = Year.now().getValue() - year;
		System.out.println("Age: " + age);
	}
}
