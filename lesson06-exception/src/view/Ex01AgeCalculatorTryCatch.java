package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeCalculatorTryCatch {
	private static Scanner ip = new Scanner(System.in);

	// Cach 2 : Xu ly khi xay ra loi , dam bao doan ma phia sau duoc thuc thi
	public static void main(String[] args) {

		// validate
		int year = 0;
		int currentYear = Year.now().getValue();
		do {
			System.out.print("Enter birth year : ");
			try {
				year = Integer.parseInt(ip.nextLine());
				if (year >= 1850 && year <= currentYear) {
					break;
				} else {
					System.out.println("require[1850,2022]");
				}

			} catch (NumberFormatException e) {
			System.out.println(">>>>>>>>> InValid number !!!\n");
				e.printStackTrace();
			}
		} while (true);

		int age = currentYear - year;
		System.out.println("Age :" + age);
	}
}
