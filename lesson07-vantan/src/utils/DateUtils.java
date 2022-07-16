package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {
	private DateUtils() {
	}
	public static Calendar getInstance(int year, int month, int date) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	public static String format(String patern, Calendar c) {
		return new SimpleDateFormat(patern).format(c.getTime());
	}
	public static Calendar getTime(int date, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, date);
		c.set(Calendar.MONTH, month);
		
		return c;
	}
	public static boolean isHoliday(Calendar checkedCal, Calendar[] holidays) {
		int dayOfMonth = checkedCal.get(Calendar.DAY_OF_MONTH);
		int month = checkedCal.get(Calendar.MONTH);
		for (Calendar holiday: holidays) {
			if (dayOfMonth == holiday.get(Calendar.DAY_OF_MONTH)
					&& month == holiday.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false;
	}
}
