package exersisesdatetime;

import java.util.Calendar;

import common.WeekDayType;

public class Ex03WeekDayAsString {
	public static void main(String[] args) {

		WeekDayType [] weekDay =  WeekDayType.values();
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JULY, 10);

		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: " + dowAsInt);
		System.out.println(weekDay[dowAsInt-1]);
	}

}
