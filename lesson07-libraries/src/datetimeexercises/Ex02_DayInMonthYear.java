package datetimeexercises;

import java.util.Calendar;

public class Ex02_DayInMonthYear {
	public static void main(String[] args) {
		//Dates in month
		int month = Calendar.MAY;
		int year = 2022;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month);
		
		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("Thang " + month  + " có " + datesInMonth + " ngày");
		int dateinyear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
	}
	
}
