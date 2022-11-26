package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.JUNE, 27);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy EEEE");

		int datesInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int dateIndex = 1; dateIndex <= datesInMonth; dateIndex++) {
			cal.set(Calendar.DAY_OF_MONTH, dateIndex);
			System.out.println(" " + df.format(cal.getTime()));
		}
		
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Calendar start = Calendar.getInstance();
		start.setTime(cal.getTime());
		
		cal.set(Calendar.DAY_OF_MONTH, datesInMonth);
		Calendar end = cal;
		end.add(Calendar.DAY_OF_MONTH, 1);
		
		System.out.println(" " +start);
		System.out.println(" " +end);
		
		for(Calendar runner = start; runner.before(end);runner.add(Calendar.DAY_OF_MONTH,1)) {
			System.out.println(" " + df.format(runner.getTime()));
		}
	}
}
