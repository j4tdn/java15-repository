package localdatetime;

import static utils.DateUtils.optinal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

import utils.DateUtils;

public class Ex04DateTimeDuration {
	public static void main(String[] args) {
		LocalDateTime dateTimeStart = LocalDateTime.of(2020, 8, 15, 10, 22, 16);
		LocalDateTime dateTimeEnd = LocalDateTime.of(2022, 7, 21, 5, 12, 30);
		
		
		
		LocalDate dateStart = dateTimeStart.toLocalDate();
		LocalTime timeStart = dateTimeStart.toLocalTime();
		if (dateTimeStart.isAfter(dateTimeEnd)) {
			throw new IllegalArgumentException("datetimeStart can not exceed date datetimeEnd");
		}
		LocalDate dateEnd = dateTimeEnd.toLocalDate();
		LocalTime timeEnd = dateTimeEnd.toLocalTime();
		
		Period period = Period.between(dateStart, dateEnd);
		Duration duration = Duration.between(timeStart, timeEnd);
		
		
		if(timeEnd.isBefore(timeStart)) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println(optinal(period.getYears(), "years") 
				+ optinal(period.getMonths(), "Months")  
				+optinal(period.getDays(), "Days"));
		System.out.println( DateUtils.optinal(duration.toHoursPart(), "Hours") 
		+optinal(duration.toMinutesPart(), "Minutes") 
		+ optinal(duration.toSecondsPart(), "seconds"));
		
	}
}
