package datatime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DatetimeInDetail {
	public static void main(String[] args) {
		System.out.println("Default locale:" +Locale.getDefault());
		Locale.setDefault(Locale.CHINESE);
		Calendar c= Calendar.getInstance();
		System.out.println("dayOfMonth: "+ c.get(Calendar.DAY_OF_MONTH) );
		
		System.out.println("dayOfYear: " + c.get(Calendar.DAY_OF_YEAR));
		//slide
		// SUNDAY=1, Sunday=2, --- Saturday=7
		int weekDay=c.get(Calendar.DAY_OF_WEEK);
		System.out.println("weekDay: " + weekDay);
		
		//first day of week
		int fdow= c.getFirstDayOfWeek();
		System.out.println("First day of week: "+ fdow);
	}
}
