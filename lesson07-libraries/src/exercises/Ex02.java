package exercises;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("Month: " + month);
		switch (month) {
		// các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng " + month + " có 31 ngày.");
			break;

		// các tháng 4, 6, 9 và 11 có 30 ngày
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng " + month + " có 30 ngày.");
			break;
		case 2:
			if (c.get(Calendar.YEAR) % 4 == 0 && c.get(Calendar.YEAR) % 100 != 0) {
				System.out.println("Tháng " + month + " có 29 ngày.");
			} else {
				System.out.println("Tháng " + month + " có 28 ngày.");

			}

		}
		if(c.get(Calendar.YEAR) % 4 == 0 && c.get(Calendar.YEAR) % 100 != 0) {
			System.out.println("Năm " + c.get(Calendar.YEAR) + " có 366 ngày.");
		}
		else {
			System.out.println("Năm " + c.get(Calendar.YEAR) + " có 365 ngày.");

		}

	}
}
