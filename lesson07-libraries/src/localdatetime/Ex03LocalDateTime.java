package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);
		
		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		
		System.out.println("date: " + date);
		System.out.println("time: " + time);
		
		// chuyển đổi localdate sang localdatetime
		date.atTime(time);

		System.out.println("===========================");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		// String --> localtime
		LocalDateTime parsedDateTime = LocalDateTime.parse("15/07/2022 15:30:45", df);
		System.out.println("parsedDateTime: " + parsedDateTime);
	}
}
