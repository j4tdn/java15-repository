package datetime.exercises;

import java.util.Calendar;

import common.WeekDayType;

public class Ex03WeekDayAsString {
	public static void main(String[] args) {
		WeekDayType[] weekDays = WeekDayType.values();
		
		//WeekDay: Sunday(1), Monday(2), ..., Saturday(7)
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JULY, 10);
		
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);	
		System.out.println("dowAsInt: " + dowAsInt);
		
		System.out.println(weekDays[dowAsInt - 1]);
		
	}
}
