package datetime.exercises;

import java.util.Calendar;

public class Ex02DateInMonthYear {
	public static void main(String[] args) {
		//Date in Month
		
		int month = Calendar.FEBRUARY;
		int year = 2020;
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		
		int datesInmonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Dates in month " +datesInmonth);
		
		int datesInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Dates in year " +datesInYear);
	}
}
