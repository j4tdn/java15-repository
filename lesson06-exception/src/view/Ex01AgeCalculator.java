package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculator {
	// cách 1: Tiền xử lí -> Đảm bảo dữ liệu không bị lỗi, exception
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String bYearAsString = null;
		// validate
		do {
			System.out.println("Enter birth year: ");
			bYearAsString = ip.nextLine();
			if (bYearAsString.matches("\\d+")) {
				break;
			}
			System.out.println(">>> Invalid number!!!");
		} while (true);
		// pass validate
		int bYear = Integer.parseInt(bYearAsString);

		int age = Year.now().getValue() - bYear;
		System.out.println("Age: " + age);
	}
}
