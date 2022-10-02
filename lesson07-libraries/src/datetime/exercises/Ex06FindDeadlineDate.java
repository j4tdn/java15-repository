package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import common.Holiday;
import utils.DateUtils;

public class Ex06FindDeadlineDate {
	private static final int BUDGET = 110;

	public static void main(String[] args) {
		Calendar[] listHolidays = Holiday.getVNmeseHoliday();
		Calendar c = DateUtils.getInstance(7, Calendar.JUNE, 2022);
		int implementedDates = 0;
		while (true) {
			int weekDay = c.get(Calendar.DAY_OF_WEEK);
			boolean isDayOff = (weekDay == Calendar.SUNDAY || weekDay == Calendar.SATURDAY||DateUtils.isHoliday(c, listHolidays));
			if (!isDayOff) {
				implementedDates++;
				if (implementedDates == BUDGET) {
					break;
				}
			} 
			c.add(Calendar.DAY_OF_MONTH, 1);
		}

		System.out.println("deadline :" + DateUtils.format("dd/MM/yyyy", c));
	}
}
