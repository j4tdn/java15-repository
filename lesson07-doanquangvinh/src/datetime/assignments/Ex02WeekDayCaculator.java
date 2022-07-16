package datetime.assignments;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

import utils.WeekDayType;

public class Ex02WeekDayCaculator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		WeekDayType[] weekDays = WeekDayType.values();
		Calendar c = Calendar.getInstance();
		System.out.print("Enter day :");
		int day = ip.nextInt();
		System.out.print("Enter month :");
		int month = ip.nextInt() - 1;
		System.out.print("Enter year :");
		int year = ip.nextInt();
		c.set(Calendar.DATE, day);
		c.set(Calendar.MONTH, month);
		c.set(Calendar.YEAR, year);
		System.out.println(getCurrentDayInYear(c));
		System.out.println(getDate(c, weekDays));
		System.out.println(getIndexDate(c));
		System.out.println(getTotalYears(c));
		System.out.println(getToTalDays(c));
	}

	private static String getCurrentDayInYear(Calendar c) {
		int currentDayInYear = c.get(Calendar.DAY_OF_YEAR);
		int totalYears = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int daysleft = totalYears - currentDayInYear;
		return "It is day number" + currentDayInYear + "of the year ," + daysleft + "days left";
	}

	private static String getDate(Calendar c, WeekDayType[] weekDays) {
		int date = c.get(Calendar.DAY_OF_WEEK);
		// System.out.println(weekDays[date-1]);
		int weeksInYear = c.get(Calendar.WEEK_OF_YEAR);
		int totalWeeks = c.getWeeksInWeekYear();
		return "It is " + weekDays[date - 1] + " number " + weeksInYear + " out of " + totalWeeks + " in "
				+ c.get(Calendar.YEAR);
	}

	private static String getIndexDate(Calendar c) {
		int count = 0;
		// Calendar checked = Calendar.getInstance();

		for (int i = 1; i < c.getActualMaximum(Calendar.DAY_OF_MONTH);) {
			c.set(Calendar.DAY_OF_MONTH, i);
			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {
				i += 7;
				count++;
			}
			i++;

		}
		return "It is " + c.get(Calendar.DAY_OF_WEEK) + " number " + count + "out of 4" + "in" + c.get(Calendar.MONTH)
				+ "  " + c.get(Calendar.YEAR);
	}
   private static String getTotalYears(Calendar c) {
	   int totalYears = c.getActualMaximum(Calendar.DAY_OF_YEAR);
	   return " Year " + c.get(Calendar.YEAR) + " has" + totalYears + " days";
   }
   private static String getToTalDays(Calendar c) {
	  
	   YearMonth obj = YearMonth.of(c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1);
	   int dayOfMonth = obj.lengthOfMonth();
	   return obj + " has " + dayOfMonth + " days" ; 
   }
}
