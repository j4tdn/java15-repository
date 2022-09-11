package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCaculatorAsTryCatch {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		// cach 2: xử lý lỗi ---
		// block scope

		int year = 0;
		do {
			System.out.println(" enter birth year");
			try {
				year = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println(">>>invalid number ");
				
			}
		} while (true);

		int age = Year.now().getValue() - year;

		System.out.println("Age " + age);
	}
}
