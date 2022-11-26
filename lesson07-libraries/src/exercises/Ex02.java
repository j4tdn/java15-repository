package exercises;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		
		int dateInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.println("date in month " +dateInMonth);
		
		
		cal.set(Calendar.YEAR, 2020);
		
		int dateInYear = cal.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("date in year " +dateInYear);
		
	}
	
	
	
}
