package exercises;

import java.util.Calendar;

public class DateUtils {
	private static String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday"};
	
	private DateUtils() {
		
	}
	
	public static String getWeekDayAsString (Calendar cal) {
		int weekDay = cal.get(Calendar.DAY_OF_WEEK);
		return days[weekDay-1];
	} 
	
	
}
