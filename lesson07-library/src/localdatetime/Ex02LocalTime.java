package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static util.DateUtils.*;

public class Ex02LocalTime {
	public static void main(String[] args) {
		
		LocalTime timeStart = LocalTime.now()
					.withHour(10)
					.withMinute(20);
		System.out.println("start time: " + timeStart);
		
		LocalTime timeEnd = LocalTime.of(16, 28);
		System.out.println("end time: " + timeEnd);
		
		Duration duration = Duration.between(timeStart, timeEnd);
		
		System.out.println("duration: " + duration);
		System.out.println("toString: " 
				+ optional(duration.toHoursPart(), "hours")
				+ optional(duration.toMinutesPart(), "minutes")
				+ optional(duration.toSecondsPart(), "seconds"));
		
		System.out.println("=====format======");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.now();
		
		System.out.println("formatted: " + df.format(time));
		//string -->localtime
		LocalTime parseTime = LocalTime.parse("15:30:45", df);
		System.out.println("parsedTime: " + parseTime);
	}
}
