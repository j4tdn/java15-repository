package datetime.exercises;

import java.util.Calendar;

public class Ex02AQ {
	public static void main(String[] args) {
		
		//date in month
		int month = Calendar.APRIL;
		int year = 2020;
		Calendar cal =  Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		//int year = cal.get(Calendar.DAY_OF_MONTH);
		
		int dateinmonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
		System.out.println("date in month : " + dateinmonth);
		
	}
}
