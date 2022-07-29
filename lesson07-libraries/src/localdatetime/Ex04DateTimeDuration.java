package localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04DateTimeDuration {
	public static void main(String[] args) {
		LocalDateTime dateTimeStart = LocalDateTime.of(2020, 8, 15, 10, 22, 16);
		LocalDateTime dateTimeEnd = LocalDateTime.of(2022, 7, 21, 5, 12, 30);
		// years , month , days , hours , minutes , secods
		if (dateTimeStart.isAfter(dateTimeEnd)) {
			throw new IllegalArgumentException("dateTimeStart cannot exceed dateTimeEnd");
		}
		LocalDate start = dateTimeStart.toLocalDate();
		LocalDate end = dateTimeEnd.toLocalDate();
		Period period = Period.between(start, end);
		LocalTime start1 = dateTimeStart.toLocalTime();
		LocalTime end1 = dateTimeEnd.toLocalTime();
		Duration duration = Duration.between(start1, end1);
		if (end1.isBefore(start1)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println("toString : " + optional(period.getYears(), "years")
				+ optional(period.getMonths(), " months" + optional(period.getDays(), " days "))
				+ optional(duration.toHoursPart(), " hours") + optional(duration.toMinutesPart(), " minutes")
				+ optional(duration.toSecondsPart(), " second"));

		System.out.println(period + " " + duration);
	}
}
