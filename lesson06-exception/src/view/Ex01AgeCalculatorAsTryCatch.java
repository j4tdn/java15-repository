package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsTryCatch {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		// Cách 2: Hậu xử lý --> Xử lý khi xảy ra lỗi để đảm bảo đoạn mã phía sau vẫn
		// được thực thi
		// try catch
		int bYear = 0;
		do {
			System.out.print("Enter birth year: ");
			try {
				bYear = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException n) {
				System.out.println(">>> Invalid number !!!");
			}

		} while (true);

		int age = Year.now().getValue() - bYear;

		System.out.println("Age: " + age);
	}
}
