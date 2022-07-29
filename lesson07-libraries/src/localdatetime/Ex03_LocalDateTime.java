package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03_LocalDateTime {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		System.out.println("date: " + date);
		System.out.println("time: " + time);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("==========format&parse");
		LocalDateTime parseDateTime = LocalDateTime.parse("21/07/2022 20:42:16", df);
		System.out.println(parseDateTime);
	}
}
