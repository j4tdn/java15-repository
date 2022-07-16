package datetime.exercises;

import java.time.YearMonth;
import java.util.Calendar;

import utils.DateUtils;

public class Ex01IsLeapYear {
	public static void main(String[] args) {
		int year = 1600;
		Calendar calendar = Calendar.getInstance();
		calendar.set(2022, Calendar.FEBRUARY, 1);
		int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(daysInMonth);
		YearMonth yearMonth = YearMonth.of(2022, 2);
		int daysOfMonth = yearMonth.lengthOfMonth();
		System.out.println(daysOfMonth);
		System.out.println("Is Leap Year :" + DateUtils.isLeapYear(year));
	}
}
