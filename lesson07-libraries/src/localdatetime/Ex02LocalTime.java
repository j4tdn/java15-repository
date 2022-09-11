package localdatetime;

import static utils.DateUtils.optinal;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import utils.DateUtils;

public class Ex02LocalTime {
	public static void main(String[] args) {
		
		LocalTime timeStar = LocalTime.now()
				.withHour(10)
				.withMinute(20);
		System.out.println("Time star: " + timeStar);
		
		LocalTime endTime = LocalTime.of(16, 28);
		System.out.println("end time " + endTime);
		
		Duration duration = Duration.between(timeStar, endTime);
		System.out.println("Duration: " + duration);
		System.out.println("to string: " + DateUtils.optinal(duration.toHoursPart(), "Hours") 
		+optinal(duration.toHoursPart(), "Minutes") 
		+ optinal(duration.toSecondsPart(), "seconds"));
		
		
		System.out.println("===========FORMAT===============");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.now();
		System.out.println("formated " +df.format(time));
		
		LocalTime parseTime = LocalTime.parse("15:20:13", df);
		System.out.println(parseTime);
	}
}
