package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import static utils.DateUtils.*;

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
		System.out.println("toString: " + optional(duration.toHoursPart(), "hours")
		+  optional(duration.toMinutesPart(), "minutes")
		+  optional(duration.toSecondsPart(), "seconds"));
	}
}
