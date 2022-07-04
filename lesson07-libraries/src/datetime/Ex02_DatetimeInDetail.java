package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02_DatetimeInDetail {
	public static void main(String[] args) {
	//	Locale.setDefault(new Locale("vi", " VN"));
		System.out.println("default locale: " + Locale.getDefault());
		Calendar c = Calendar.getInstance();
		System.out.println("DayofMonth: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("DayofYear: " + c.get(Calendar.DAY_OF_YEAR));
		
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);
		
		int fdow = c.getFirstDayOfWeek();
		System.out.println(fdow);
	}
}
