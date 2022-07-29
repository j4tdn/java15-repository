package localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex04_DateTimeDuration {
	public static void main(String[] args) {
		LocalDateTime datetimeStart = LocalDateTime.of(2020, 8, 15, 10,22,16);
		LocalDateTime datetimeEnd = LocalDateTime.of(2022, 7, 21, 5,12,30);
		
		LocalDate dstart = datetimeStart.toLocalDate();
		LocalDate dend = datetimeEnd.toLocalDate();
		LocalTime tstart = datetimeStart.toLocalTime();
		LocalTime tsend = datetimeEnd.toLocalTime();
		Period period = Period.between(dstart, dend);
		System.out.print("toString: " + optional (period.getYears(), "years ")
		+ optional(period.getMonths(), "months ")
		+ optional(period.getDays(), "days"));
		Duration duration = Duration.between(tstart, tsend);
		if(tstart.isBefore(tsend)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.print(" " + optional(duration.toHoursPart(), "hours ")
		   + optional(duration.toMinutesPart(), "minutes ")
		   + optional(duration.toSecondsPart(), "seconds"));
		
		

		
	}
}