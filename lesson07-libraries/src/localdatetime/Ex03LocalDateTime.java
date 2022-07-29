package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		// LocalDate , LocalTime , LocalDateTime
		// period , duration
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime);
		LocalDate date = nowDateTime.toLocalDate();
		LocalTime time = nowDateTime.toLocalTime();
		System.out.println(date);
		System.out.println(time);
		date.atTime(time);

		System.out.println("=============================format&&parse===========================");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime parseddaDateTime = LocalDateTime.parse("21/07/2022 20:42:16", df);
        System.out.println("parsedDateTime :" + parseddaDateTime);
	}
}
