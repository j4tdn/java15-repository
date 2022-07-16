package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex06FindDeadlineDate {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy ");
		Calendar c = DateUtils.getInstance(Calendar.JUNE, 2022);
		int countday = 0;
		c.set(Calendar.DAY_OF_MONTH, 7);
		while (countday < 110) {
			Date now = c.getTime();

			Calendar x1 = DateUtils.getInstance(Calendar.SEPTEMBER, 2022);
			Calendar x2 = DateUtils.getInstance(Calendar.SEPTEMBER, 2022);
			x1.set(Calendar.DAY_OF_MONTH, 02);
			x2.set(Calendar.DAY_OF_MONTH, 03);
			Date t1 = x1.getTime();
			Date t2 = x2.getTime();

			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY || c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
					|| now.compareTo(t1) == 0 || now.compareTo(t2) == 0) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				continue;
			} else {
				c.add(Calendar.DAY_OF_MONTH, 1);
				String formatted = df.format(now);
				System.out.println(formatted);
				countday++;
				
			}
		}
	}
}
