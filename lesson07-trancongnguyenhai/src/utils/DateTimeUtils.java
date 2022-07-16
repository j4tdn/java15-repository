package utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;

public class DateTimeUtils {
	public static void dayOfWeekFromADay(LocalDateTime c) {
		System.out.println("Day Love start is: " + c.getDayOfWeek());
	}

	public static void dayOfWeekFromADay(LocalDate c) {
		System.out.println(
				"" + c.getDayOfMonth() + " " + c.getMonth() + " " + c.getYear() + " " + "is a " + c.getDayOfWeek());
	}

	public static void dayOfYear(LocalDate c) {
		System.out.println("It is day number " + c.getDayOfYear() + " of the year, "
				+ (c.lengthOfYear() - c.getDayOfYear() + " days left"));
	}

	public static void numberDayOfWeekInYear(LocalDate c) {
		int num = c.getDayOfYear() / 7;
		int numTotal = num;
		int numOfday = c.getDayOfYear();
		do {
			numOfday += 7;
			numTotal += 1;
		} while (numOfday < c.lengthOfYear());
		if (c.getDayOfWeek().getValue() >= c.withDayOfYear((c.getDayOfYear() % 7)).getDayOfWeek().getValue()) {
			num += 1;
		}
		System.out
				.println("It is " + c.getDayOfWeek() + " number " + num + " out of " + numTotal + " in " + c.getYear());
	}

	public static void numberDayOfWeekInMonth(LocalDate c) {
		int num = c.getDayOfMonth() / 7;
		int numTotal = num;
		int numOfday = c.getDayOfMonth();
		do {
			numOfday += 7;
			numTotal += 1;
		} while (numOfday < c.lengthOfMonth());
		if (c.getDayOfWeek().getValue() >= c.withDayOfMonth((c.getDayOfMonth() % 7)).getDayOfWeek().getValue()) {
			num += 1;
		}
		System.out.println("It is " + c.getDayOfWeek() + " number " + num + " out of " + numTotal + " in "
				+ c.getMonth().name() + " " + c.getYear());
	}

	public static void numOfDaysInYear(LocalDate c) {
		System.out.println("Year " + c.getYear() + " has " + c.lengthOfYear() + " days");
	}

	public static void numOfDaysInMonth(LocalDate c) {
		System.out.println("" + c.getMonth().name() + " " + c.getYear() + " has " + c.lengthOfMonth() + " days");
	}

	public static void timeLoved(LocalDateTime a, LocalDateTime b) {
		Period period = Period.between(a.toLocalDate(), b.toLocalDate());
		Duration duration = Duration.between(a.toLocalTime(), b.toLocalTime());
		System.out.println("Time loved: " + optional(period.getYears(), "years")
				+ optional(period.getMonths(), "months") + optional(period.getDays(), "days")
				+ optional(duration.toHoursPart(), "hours") + optional(duration.toMinutesPart(), "minutes")
				+ optional(duration.toSecondsPart(), "seconds"));
	}

	public static String optional(long dmy, String unit) {
		return dmy > 0 ? (dmy + " " + unit + " ") : " ";
	}
}
