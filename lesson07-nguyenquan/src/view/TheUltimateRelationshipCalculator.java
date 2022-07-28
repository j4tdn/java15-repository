package view;

import java.time.Duration;
import java.time.LocalDate;

import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static utils.Dateutils.*;
import utils.Dateutils;

public class TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		int select = 0;
		LocalDate startDate;
        LocalDate endDate;
        LocalTime startTime;
        LocalTime endTime;
        Duration duration;
        Period period;
		Scanner sc = new Scanner(System.in);
		do {
		try{
			
		System.out.print("báº¡n Ä‘ang háº¹n hÃ²/chia tay(0/1):");
		select = sc.nextInt();
		if (select == 0) {
			System.out.println("nháº­p ngÃ y háº¹n hÃ²:");
			startDate = formatDate();
			System.out.println("nháº­p thá»�i gian háº¹n hÃ²:");
			startTime= formatTime();
			
			endDate = LocalDate.now();
			endTime = LocalTime.now();
		} else {
			System.out.println("nháº­p ngÃ y háº¹n hÃ²:");
			startDate = formatDate();
			System.out.println("nháº­p thá»�i gian háº¹n hÃ²:");
			startTime= formatTime();
			System.out.println("nháº­p ngÃ y chia tay:");
			endDate = formatDate();
			System.out.println("nháº­p thá»�i gian chia tay:");
			endTime  =formatTime();
		}
		Dateutils.check(startDate, endDate);
		break;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		}while(true);
		if(endTime.isBefore(startTime)) {
		
		 duration = Duration.between(startTime, endTime).plusHours(24);
		 
		 period = Period.between(startDate, endDate).minusDays(1);
		}
		else {
			duration = Duration.between(startTime, endTime);
			period = Period.between(startDate, endDate);
			
		}System.out.println(startDate.getDayOfWeek());
		System.out.println("===============thá»�i gian háº¹n hÃ² lÃ ============");
		System.out.println(
				 optional(period.getYears(), "years")
				+ optional(period.getMonths(), "months")
				+ optional(period.getDays(), "days"));
	
		System.out.println(
				 optional(duration.toHoursPart(), "hours")
				+ optional(duration.toMinutesPart(), "minutes")
				+ optional(duration.toSecondsPart(), "seconds"));
		

	}
	

}
