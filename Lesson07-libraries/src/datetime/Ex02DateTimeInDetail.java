package datetime;

import java.util.Calendar;
import java.util.Locale;

public class === {
	public static void main(String[] args) {
		System.out.println("default locale: " + Locale.getDefault());
		
		Calendar c = Calendar.getInstance();
		System.out.println("dayOfMonth: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("dayOfYear: " + c.get(Calendar.DAY_OF_YEAR));
		
		// xem slide
		// Sunday = 1, Monday = 2.... Saturday = 7
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);
		
		// firstDayOfWeek
		int fdow = c.getFirstDayOfWeek();
		System.out.println("fdow: " + fdow);
	}
}