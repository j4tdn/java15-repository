package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex05NumberOfSundays {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy ");
		Calendar c = DateUtils.getInstance(Calendar.AUGUST, 2022);
		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <= datesInMonth;) {
			c.set(Calendar.DAY_OF_MONTH, i);
			Date date = c.getTime();
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
				String dateformat = df.format(date
						) + " " + DateUtils.getWdAsUS(c);
				System.out.println(dateformat);
				i += 7;
				continue;
			}
              i++;
		}
	}
}