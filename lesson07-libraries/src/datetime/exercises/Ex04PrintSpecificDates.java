package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import utils.DateUtils;

public class Ex04PrintSpecificDates {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy ");
		Calendar c = DateUtils.getInstance(Calendar.AUGUST, 2022);
		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <= datesInMonth; i++) {
			c.set(Calendar.DAY_OF_MONTH, i);
			Date date = c.getTime();
			String dateformat = df.format(date) + " " + DateUtils.getWdAsUS(c);
			System.out.println(dateformat);
		}
		System.out.println("===============================================");
		System.out.println("Default : " + Locale.getDefault());

		// 08.07.2022
		Calendar now = Calendar.getInstance();
		now.set(2022, Calendar.JULY, 27);
		// FirstDayNumOfWeek = current_date_number + fdow(sunday or monday) -
		// current_week
		now.add(Calendar.DAY_OF_MONTH, now.getFirstDayOfWeek() - now.get(Calendar.DAY_OF_WEEK));
		System.out.println("First day of week" + df.format(now.getTime()));
		for (int i = 1; i <= 7; i++) {
			String dateformat = df.format(now.getTime()) + " " + DateUtils.getWdAsUS(c);
			System.out.println(dateformat);
			now.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
