package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DatetimeDetail {
	public static void main(String[] args) {
		System.out.println("default locale: " +Locale.getDefault());
		//Locale.setDefault(Locale.FRANCE);
		//Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
		
		System.out.println("day of month : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("day of year : " + c.get(Calendar.DAY_OF_YEAR));
		//sunday = 1 .......
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);
		//first of week
		int fdOw = c.getFirstDayOfWeek();
		System.out.println(fdOw);
	}
}
