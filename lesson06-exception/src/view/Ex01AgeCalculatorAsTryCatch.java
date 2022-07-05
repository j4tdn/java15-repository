package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsTryCatch {
	// Cách 2: Hậu xử lí--> Xử lí khi xảy ra lỗi, đảm bảo đoạn mã phía sau
	// 2.1 Try Catch
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		int bYear = 0;
		do {
			System.out.println("Enter birth year:");
			try {
				bYear = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				//e.printStackTrace();// In ra lỗi
				System.out.println("Invalid number!!!\n");
				
			}
		} while (true);

		int age = Year.now().getValue() - bYear;
		System.out.println("Age: " + age);

		System.out.println("Finish!");

	}
}
