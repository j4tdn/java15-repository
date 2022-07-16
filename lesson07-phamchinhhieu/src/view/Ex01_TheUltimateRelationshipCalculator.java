package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

import static utils.DateUtils.*;

public class Ex01_TheUltimateRelationshipCalculator {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int count = 0;
		int date, month, year;
		do {
			System.out.print("Nhap ngay quen nhau: ");
			date = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap thang quen nhau: ");
			month = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap nam quen nhau: ");
			year = Integer.parseInt(sc.nextLine());
			
			try {
				if(Check(date, month, year)) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while(true);
		
		LocalDate dateEnd = LocalDate.now();
		LocalTime dateEndTime = LocalTime.now();
		LocalDate dateStart = LocalDate.of(year, month, date);
		LocalTime dateStartTime = LocalTime.of(0, 0, 0);
		check1(dateStart, dateEnd);
		Period period = Period.between(dateStart, dateEnd);
		Duration dutation = Duration.between(dateStartTime, dateEndTime	);
		System.out.println("they fell in love on day: "+ dateStart.getDayOfWeek());
		System.out.println("They have been in love for: " + optional (period.getYears(), "years ")
										+ optional(period.getMonths(), "months ")
										+ optional(period.getDays(), "days ")
										+ optional(dutation.toHoursPart(), "hours ")
		  								+ optional(dutation.toMinutesPart(), "minutes ")
		  								+ optional(dutation.toSecondsPart(), "seconds"));
	}
	private static boolean check1(LocalDate dateStart, LocalDate dateEnd) {
		if (dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end");
		}
		return true;
	}

	
}
