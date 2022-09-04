package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorAsTryCatch {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// Cách 2: Hậu xử lí--> khi mà xảy ra lỗi, đảm bảo đoạn mã phía sau vẫn được
		// thực thi
		// 2.1 Try Catch

		// function scope ,--> block scope( chỉ dùng trong cặp dấu ngoặc {}

		int bYear = 0;
		do {
			System.out.println("Enter birth year: ");

			try {
				bYear = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Nhap sai roi Bro, nhap lai nha");
				// e.printStackTrace();
			}

		} while (true);

		// int bYear = Integer.parseInt(ip.nextLine());
		// System.out.println("Anh nho em");
		int age = Year.now().getValue() - bYear;
		System.out.println("tuoi cua ban la: " + age);

	}
}
