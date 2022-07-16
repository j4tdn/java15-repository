package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsTryCatch {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi, đảm bảo đoạn mã phía sau vẫn được thực thi
		// 2.1 Try Catch
		
		// function scope, ---> block scope
		int currentYear = Year.now().getValue();
		int bYear = 0;
		do {
			System.out.print("Enter birth year: ");
			try {
				bYear = Integer.parseInt(ip.nextLine());
				boolean isValidExtendRequirement = (bYear >= 1850 && bYear <= currentYear);
				if (isValidExtendRequirement) {
					break;
				}
				System.out.println("Require [1850, 2022]");
			} catch (NumberFormatException e) {
				System.out.println(">>> InValid number !!!\n");
			}
		} while(true);
		
		int age = currentYear - bYear;
		System.out.println("Age: " + age);
		
		System.out.println("\nFinished !!!");
	}
	
	/*
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "hello"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:580)
	at java.lang.Integer.parseInt(Integer.java:615)
	at view.Ex01AgeCalculator.main(Ex01AgeCalculator.java:12)
	 */
}