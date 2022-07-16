package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	public static Calendar getInstance(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		return c;
	}
	public static Calendar getTime(int date, int month) {
		Calendar c= Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, date);
		return c;
	}
	public static String formatDate(String pattern, Calendar c) {
		return new SimpleDateFormat(pattern).format(c.getTime());
	}
	public static boolean isHoliday(Calendar checkedCal, Calendar[] holidays) {
		int dayOfMonth= checkedCal.get(Calendar.DAY_OF_MONTH);
		int month=checkedCal.get(Calendar.MONTH);
		for(Calendar holiday:holidays) {
			if(dayOfMonth==holiday.get(Calendar.DAY_OF_MONTH)&& month==holiday.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false;
	}

}
