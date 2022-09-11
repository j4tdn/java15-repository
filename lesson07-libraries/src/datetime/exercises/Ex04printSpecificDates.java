package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex04printSpecificDates {
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy E");

	public static void main(String[] args) {
		int year = 2022;
		int month = Calendar.APRIL;

		Calendar c = DateUtils.getInstant(year, month, month);

		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		for (int day = 1; day <= datesInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);
			String dfS = df.format(c.getTime());
			System.out.println(dfS);
			
			
			
		}
		System.out.println("================");
		Calendar now  = Calendar.getInstance();
		
		now.add(Calendar.DAY_OF_MONTH, now.getFirstDayOfWeek() - now.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week " + df.format(now.getTime()));
		
	}
	
}
