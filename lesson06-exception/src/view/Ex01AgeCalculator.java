package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculator {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Cách 1: Tiền xử lý --> Đảm bảo dữ liệu không bị lỗi, exception 
		String bYearAsString = null;
		//validate
		do {
			System.out.print("Enter birth year: ");
			bYearAsString = ip.nextLine();
			if(bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println(">>> Invalid number!!!");	
		}while(true);
		
		//passed validation
		int bYear = Integer.parseInt(bYearAsString);
		
		int age = Year.now().getValue() - bYear;
		System.out.println("Age: " + age);
				
	}
}
