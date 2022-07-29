package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DatetimeInDetail {
	public static void main(String[] args) {
		System.out.println("default locale: " + Locale.getDefault());
		// Locale.setDefault(Locale.FRANCE);
		// Locale.setDefault(new Locale("vi", "VN"));
		// Locale.setDefault(Locale.GERMANY);
		
		Calendar c = Calendar.getInstance();
		
		System.out.println("dayOfMonth: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("dayOfYear: " + c.get(Calendar.DAY_OF_YEAR));
	
		// slides
		// SUNDAY = 1, Monday=2, --- Saturday=7
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);
		
		// firstDayOfWeek
		int fdow = c.getFirstDayOfWeek();
		System.out.println("fdow: " + fdow);
		
	}
}