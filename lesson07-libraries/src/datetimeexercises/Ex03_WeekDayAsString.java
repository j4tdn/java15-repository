package datetimeexercises;

import java.util.Calendar;

import common.WeekDayType;

public class Ex03_WeekDayAsString {
	public static void main(String[] args) {
		WeekDayType[] weekDateAsString = WeekDayType.values();
				
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JULY, 10);
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		
	//	System.out.println("dowAsInt" + dowAsInt);
		System.out.println(weekDateAsString[dowAsInt-1]);
	}
}
