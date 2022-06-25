package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01_AgeCalculatorAsTryCatch {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		int bYear = 0;
		do {
		System.out.println("Enter birth year: ");
		try {
			bYear = Integer.parseInt(ip.nextLine());
			break;
			
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		} while(true);
		int age = Year.now().getValue() - bYear;
		System.out.println("Age = " + age);
		
		
 	}
}
