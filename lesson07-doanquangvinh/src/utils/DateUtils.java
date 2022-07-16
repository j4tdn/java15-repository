package utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateUtils {
	private DateUtils() {

		// TODO Auto-generated constructor stub
	}

	public static String between(Calendar start, Calendar now) {
		if (start.after(now)) {
			throw new IllegalArgumentException("start date can not exceed date !!!");
		}
		long startInMils = start.getTimeInMillis();
		long nowInMils = now.getTimeInMillis();
		long duration = nowInMils - startInMils;

		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		long hours = TimeUnit.MILLISECONDS.toHours(duration);
		duration -= TimeUnit.HOURS.toMillis(hours);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		duration -= TimeUnit.MINUTES.toMillis(minutes);
		long second = TimeUnit.MILLISECONDS.toMillis(duration);
		duration -= TimeUnit.SECONDS.toMillis(second);
		return days + "D" + hours + "H" + minutes + "M" + second + "S";
	}
}
