package exercise;

import java.util.Calendar;

import common.WeekDayType;

public class Ex03 {
	public static void main(String[] args) {
		//WeekDay: sun(1).... sat(7)
		WeekDayType[] weekDateAsString= WeekDayType.values();
		
		Calendar c= Calendar.getInstance();
		c.set(2022, Calendar.JULY, 9);
		
		int dowAsInt =c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: "+ dowAsInt);
		
		System.out.println(weekDateAsString[dowAsInt-1]);
	}
}
