package datetime.exercise;

import java.util.Calendar;

import common.WeekDayType;

public class Ex03 {
	public static void main(String[] args) {
		WeekDayType[] weekDays = WeekDayType.values();
		Calendar c = Calendar.getInstance();

		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: " + dowAsInt);
		System.out.println(weekDays[dowAsInt - 1]);
	}
}
