package exercises;

import java.util.Calendar;

public class Ex02DayInMonthYear {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		// Cach 1: Dùng switch case
		
		// Cach 2: Date in Month
		int month = Calendar.MAY;
		int year = 2022;
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		
		int datesInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Days In Month: " + datesInMonth);
		
		int datesInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Days In Month: " + datesInYear);
		
	}
}
