package utils;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class DateUtils {
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}

	public static String between(Calendar start, Calendar end) {
		if (start.after(end)) {
			throw new IllegalArgumentException("start date cannot exceed end date!!!");
		}
		long startInMils = start.getTimeInMillis();
		long endtInMils = end.getTimeInMillis();
		long duration = endtInMils - startInMils;
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);

		long hour = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hour);

		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);

		long second = TimeUnit.MILLISECONDS.toSeconds(duration);
		duration -= TimeUnit.SECONDS.toMillis(second);

		return days + " D  " + hour + " H " + minutes + " M " + second + " S " + duration + " MS ";
	}

	public static Calendar getIntance(int date, int month, int year, int hour, int minute, int second) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date, hour, minute, second);
		return c;
	}
	public static String optional(long dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit : " ";
	}
	public static boolean Check(int day, int month, int year) throws Exception {
		Calendar c = Calendar.getInstance();
		if(month < 1 || month > 12) {
			throw new Exception("Tháng không hợp lệ");
		}
		c.set(Calendar.MONTH, month - 1 );
		c.set(Calendar.YEAR, year );
		if(day < 1 || day > c.getActualMaximum(Calendar.DAY_OF_MONTH))
			throw new Exception("Ngày không hợp lệ");
		
		return true;
		
	}

}
