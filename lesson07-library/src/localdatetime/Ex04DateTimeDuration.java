package localdatetime;


import static util.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04DateTimeDuration {
	public static void main(String[] args) {
		LocalDateTime datetimeStart = LocalDateTime.of(2020, 8, 15, 10, 22, 16);
		LocalDateTime datetimeEnd = LocalDateTime.of(2020, 7, 21, 20, 12, 30);
		
		//years, months, days, hours, minutes, seconds
		if(datetimeStart.isAfter(datetimeEnd)) {
			throw new IllegalArgumentException("datetimeStart cannot exceed datetimeEnd !!!");
		}
		LocalDate dateStart = datetimeStart.toLocalDate();
		LocalTime timeStart = datetimeEnd.toLocalTime();
		
		LocalDate dateEnd = datetimeStart.toLocalDate();
		LocalTime timeEnd = datetimeEnd.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		if(timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println(
				 optional(period.getYears(), "years")
				+ optional(period.getMonths(), "months")
				+ optional(period.getDays(), "days"
				+ optional(duration.toHoursPart(), "hours")
				+ optional(duration.toMinutesPart(), "minutes")
				+ optional(duration.toSecondsPart(), "seconds")));
	
	} 
}
