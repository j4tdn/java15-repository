package exercises;

import java.util.Calendar;

public class Ex02DatesInMonthYear {
	public static void main(String[] args) {
		// Dates In Month
		int month = Calendar.FEBRUARY;
		int year = 2020;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		
		int datesInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Days In Month: " + datesInMonth);
		
		int datesInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Days In Year: " + datesInYear);
	}
}