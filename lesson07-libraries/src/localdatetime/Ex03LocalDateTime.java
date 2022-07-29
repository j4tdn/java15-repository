package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex03LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("now: " + now);

		LocalDate date = now.toLocalDate();
		LocalTime time = now.toLocalTime();
		
		System.out.println("date: " + date);
		System.out.println("time: " + time);
		
		date.atTime(time);
		
		System.out.println("===============format=================");
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Scanner ip = new Scanner(System.in);
		System.out.println("input: ");
		String input = ip.nextLine();
		System.out.println(LocalDateTime.parse(input, df));
		
		
	}
}
