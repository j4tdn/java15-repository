package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		//LocalDate,LocalTime,LocalDatetime
		//Period,Duration
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);
		
		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		System.out.println("date: " + date);
		System.out.println("time: " + time);
		
		//ngược lại muốn chuyển date, time về lại
		//date.atTime
		//time.atDay
		
		System.out.println("==========format&parse=======");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		// String --> localtime
		LocalDateTime parsedDateTime = LocalDateTime.parse("15/07/2022 15:30:45", df);
		System.out.println("parsedDateTime: " + parsedDateTime);
	}
}
