package datetime.exercises;

import java.util.Calendar;

public class Ex02DateInMonthYear {
    // Days in Month
	public static void main(String[] args) {
		int month = Calendar.MAY;
		int year = 2022;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		int datesInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Days In Month :" + datesInMonth);
	}
}
