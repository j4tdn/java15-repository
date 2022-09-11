package datetime.exercises;

import java.util.Calendar;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("is leap year : " +isLeapYear(2022));
	}

	private static boolean isLeapYear(int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
	}
}
