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
			
		System.out.print("bạn đang hẹn hò/chia tay(0/1):");
		select = sc.nextInt();
		if (select == 0) {
			System.out.println("nhập ngày hẹn hò:");
			startDate = formatDate();
			System.out.println("nhập thời gian hẹn hò:");
			startTime= formatTime();
			
			endDate = LocalDate.now();
			endTime = LocalTime.now();
		} else {
			System.out.println("nhập ngày hẹn hò:");
			startDate = formatDate();
			System.out.println("nhập thời gian hẹn hò:");
			startTime= formatTime();
			System.out.println("nhập ngày chia tay:");
			endDate = formatDate();
			System.out.println("nhập thời gian chia tay:");
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
		System.out.println("===============thời gian hẹn hò là============");
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
