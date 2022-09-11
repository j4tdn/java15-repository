package logic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTime {
	public static void main(String[] args) {
		String[] availableTimezones = TimeZone.getAvailableIDs();
		for (String timezone : availableTimezones) {
			System.out.println("Timezone ID = " + timezone);
			Calendar cal = Calendar.getInstance();
			cal.setTimeZone(TimeZone.getTimeZone(timezone));
			System.out.println(new SimpleDateFormat("HH:mm:ss a").format(cal.getTime()));
		}
	}
}
