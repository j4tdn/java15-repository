package exersises;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Day of month is :" + dayOfMonth(calendar));
		if (check(calendar)) {
			System.out.println("Day of year is: 366");
		} else {
			System.out.println("Day of year is : 365");
		}

	}

	public static int dayOfMonth(Calendar calendar) {
		switch (calendar.get(calendar.MONTH) + 1) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			if (check(calendar)) {
				return 29;
			}

			else {
				return 28;
			}
		default:
			System.out.println("so thang khong hop le");
			return 0;

		}
	}

	public static boolean check(Calendar calendar) {
		if (calendar.get(Calendar.YEAR) % 400 == 0) {
			return true;

		}
		if (calendar.get(Calendar.YEAR) % 4 == 0 && calendar.get(Calendar.YEAR) % 100 != 0) {
			return true;
		}
		return false;

	}
}
