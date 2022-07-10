package datetime.exercises;

import java.util.Calendar;

import common.WeekDayType;

public class Ex03WeekDayAsString {
	public static void main(String[] args) {
		WeekDayType[] weekDays = WeekDayType.values();
		
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JULY, 12);
		
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: " + dowAsInt);
		
		System.out.println(weekDays[dowAsInt-1]);
	}
}
