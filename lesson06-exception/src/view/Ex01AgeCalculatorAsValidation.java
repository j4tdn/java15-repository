package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsValidation {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//String bYearAsString = ip.nextLine();
		String bYearAsString = null;
		//validate (Xác Nhận)
		//do {
		while(true) {
			System.out.println("Enter birth year: ");
			bYearAsString = ip.nextLine();
									// Một hoặc nhiều (d+)
			if (bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println("Khong hop le mat roi Bro ");
		
			}
	//while(true);
		
		// pass vadilation
		
		
		//int bYear = Integer.parseInt(ip.nextLine());
		
		int bYear = Integer.parseInt(bYearAsString);
		
		int age = Year.now().getValue()- bYear;
		System.out.println("Tuoi cua ban la: "+ age );
		
	}
}
