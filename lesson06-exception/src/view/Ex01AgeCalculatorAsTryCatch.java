package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsTryCatch {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi, đảm bảo đoạn mã phía sau vẫn đưuọc thực thi
		//2.1 Try catch
		
		//function scope ---> block scope
		
		
		int bYear = 0;
		do {
			System.out.print("Enter birth year: ");
			try {
				bYear = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(">>> Invalid number !!!\n");
			}
		}while(true);
		
		int age = Year.now().getValue() - bYear;
		System.out.println("Age: " + age);
		
		System.out.println("\nFinished!!!");
	}
}
