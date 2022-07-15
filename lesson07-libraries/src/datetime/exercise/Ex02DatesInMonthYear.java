package datetime.exercise;

import java.util.Calendar;

public class Ex02DatesInMonthYear {
	public static void main(String[] args) {
		// Dates In Month
		int month = Calendar.MAY;
		int year = 2022;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		
		// Lấy cái month và cái year của thằng Cal để trả giá trị
		// getActualMaximum(): giá trị tối đa của cái field (ở đây là 
		// month và year)
		int datesInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Days In Month: " + datesInMonth);
		int datesInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Days In Year: " + datesInYear);
		
	}
}
