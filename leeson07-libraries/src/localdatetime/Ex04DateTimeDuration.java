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
	LocalDateTime dateTimeEnd = LocalDateTime.of(2022, 7, 21, 20, 12, 30);
	if(dateTimeStart.isAfter(dateTimeEnd)) {
		throw new IllegalArgumentException("datetimeStart cannot exceed datimeEnd !!!");
	}
	LocalDate dateStart = dateTimeStart.toLocalDate();
	LocalDate dateEnd = dateTimeEnd.toLocalDate();
	LocalTime timeStart = dateTimeStart.toLocalTime();
	LocalTime timeEnd = dateTimeEnd.toLocalTime();
	Period period = Period.between(dateStart, dateEnd);
	Duration duration = Duration.between(timeStart, timeEnd);
	if(timeEnd.isBefore(timeStart)) {
		duration = duration.plusDays(1);
		period = period.minusDays(1);
	}
	System.out.println( 
			 optional(duration.toHoursPart(), "hours")
			+ optional(duration.toMinutesPart(), "minutes")
			+ optional(duration.toSecondsPart(), "seconds"));
	System.out.println(
			 optional(period.getYears(), "years")
			+ optional(period.getMonths(), "months")
			+ optional(period.getDays(), "days"));
	}

}
