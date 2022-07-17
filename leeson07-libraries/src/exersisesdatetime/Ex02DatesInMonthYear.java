package exersisesdatetime;

import java.util.Calendar;

public class Ex02DatesInMonthYear {
public static void main(String[] args) {
	int month = Calendar.MAY;
	int year = 2022;
	Calendar cal = Calendar.getInstance();
	cal.set(Calendar.MONTH, month);
	cal.set(Calendar.YEAR, year);
	
	int datesInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println(datesInMonth);
	int datesInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	System.out.println(datesInYear);

}
}
