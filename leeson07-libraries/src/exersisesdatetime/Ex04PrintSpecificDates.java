package exersisesdatetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

public class Ex04PrintSpecificDates {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Calendar c = DateUtils.getInstance(Calendar.AUGUST, 2020);
		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int day = 1; day <= datesInMonth; day++) {
			c.set(Calendar.DAY_OF_MONTH, day);

			String formatted = df.format(c.getTime()) + " " + DateUtils.getWdAsVnmese(c);
			System.out.println(formatted);
		}
		System.out.println("====================");
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_MONTH, now.getFirstDayOfWeek() - now.get(Calendar.DAY_OF_WEEK));
		System.out.println("first day of week :" + df.format(now.getTime()));
		for (int i = 1; i <= 7; i++) {
			
			String formatted = df.format(now.getTime()) + " " + DateUtils.getWdAsVnmese(now);
			System.out.println(formatted);
			now.add(Calendar.DAY_OF_MONTH, 1);

		}

	}

}
