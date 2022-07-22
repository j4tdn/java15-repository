package localdatetime;

import static utils.DateUtils.optional;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime timeStart = LocalTime.now().withHour(10).withMinute(20);
		
		System.out.println("StartTime " + timeStart);
		
		LocalTime timeEnd = LocalTime.of(16,28);
		System.out.println("EndTime " + timeEnd);
		
		Duration duration = Duration.between(timeStart, timeEnd);
		System.out.println("duration " + duration);
		System.out.println("toString " + optional(duration.toHoursPart(),"hours")
									   + optional(duration.toMinutesPart(),"minutes")
									   + optional(duration.toSecondsPart(),"seconds"));
		
		System.out.println("===========================");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		LocalTime time = LocalTime.now();
		System.out.println("formatted: " + df.format(time));
		
		// String --> localtime
		LocalTime parsedTime = LocalTime.parse("15:30:45", df);
		System.out.println("parsedTime: " + parsedTime);
	}
}
