package datetime.exercises;

import java.util.Calendar;

import comon.WeekDateType;

public class Ex03WeekDayOfString {
	public static void main(String[] args) {
		WeekDateType[] wdt = WeekDateType.values();
		
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JULY, 11);
		
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow AS int " + dowAsInt);
		
		System.out.println("dow As int " + wdt[dowAsInt-1]);
	}
}
