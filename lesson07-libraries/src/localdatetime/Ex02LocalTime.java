package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static utils.DateUtils.*;

public class Ex02LocalTime {
	public static void main(String[] args) {
		LocalTime timeStart = LocalTime.now().withHour(10).withMinute(20);

		System.out.println("Start time: " + timeStart);

		LocalTime endTime = LocalTime.of(16, 28);
		System.out.println("End time: " + endTime);

		Duration duration = Duration.between(timeStart, endTime);
		System.out.println("duration: " + duration);
		System.out.println("toString: "
				+ optinal(duration.toHoursPart(), "hours")
				+ optinal(duration.toMinutesPart(), "minutes")
				+ optinal(duration.toSecondsPart(), "seconds"));
		
		String formatter = "HH:mm:ss";
		DateTimeFormatter df = DateTimeFormatter.ofPattern(formatter);
		LocalTime date = LocalTime.now();
		System.out.println("format: " + df.format(date));
		
		LocalTime parsedTime = LocalTime.parse("15:20:45", df);
		System.out.println("parseTime: " + parsedTime);
	}
}
