package view;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Utils {

	private Utils() {
   		
   	}
	
	public static Calendar getInstance(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	
	public static String between(Calendar start, Calendar end) {
		if (start.after(end)) {
			throw new IllegalArgumentException("start date cannot exceed end date !!!");
		}
		
		// long --> milliseconds --> end - start
		// milliseconds -> "year, month" day, hour, minute, second
		
		long startInMils = start.getTimeInMillis();
		long endInMils = end.getTimeInMillis();
		
		long duration = endInMils - startInMils; // milliseconds
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);

		
		return days     + " days ";
	}
}
