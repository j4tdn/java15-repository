package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import static Util.DateUtils.*;

public class Ex02LocalTime {
	public static void main(String[] args) {
		
		LocalTime timeStart = LocalTime.now().withHour(10).withMinute(20);
		System.out.println("timeStart: " + timeStart);
		
		
		LocalTime timeEnd = LocalTime.of(16, 28);
		System.out.println("timeEnd: " + timeEnd);
		
		Duration duration = Duration.between(timeStart, timeEnd);
		System.out.println("duration: " + duration);
		// có thể dùng toHoursPart
		System.out.println("toString: " + optional(duration.toHoursPart(), "hours") + optional(duration.toMinutesPart(), "minutes") + optional(duration.toSecondsPart(), "seconds"));
	}
}
