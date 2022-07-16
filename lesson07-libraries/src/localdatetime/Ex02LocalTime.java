package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import static utils.DateUtils.*;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime timeStart = LocalTime.now().withHour(10).withMinute(20);

		System.out.println("start time : " + timeStart);

		LocalTime endTime = LocalTime.of(16, 28);
		System.out.println("end time : " + endTime);
		Duration duration = Duration.between(timeStart, endTime);
		System.out.println("duration :" + duration);

		System.out.println("toString : " + optional(duration.toHoursPart(), "hours")
				+ optional(duration.toMinutesPart(), "minutes") + optional(duration.toSecondsPart(), "second"));
	}
}
