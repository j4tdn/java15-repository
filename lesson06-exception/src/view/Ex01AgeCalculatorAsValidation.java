package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsValidation {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Cách 1: Tiền xử lý --> Đảm bảo dữ liệu không bị lỗi, exception
		
		String bYearAsString = null;
		// validate
		do {
			System.out.print("Enter birth year: ");
			bYearAsString = ip.nextLine();
			if (bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println(">>> InValid number !!!\n");
		} while(true);
		
		// passed validation
		int bYear = Integer.parseInt(bYearAsString);
		
		int age = Year.now().getValue() - bYear;
		System.out.println("Age: " + age);
	}
	
	/*
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at view.Ex01AgeCalculator.main(Ex01AgeCalculator.java:12)
	  
	  
	 */
}