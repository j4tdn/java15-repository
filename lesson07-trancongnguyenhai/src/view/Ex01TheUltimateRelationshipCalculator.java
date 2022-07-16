package view;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

import utils.DateTimeUtils;

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		// LocalDateTime dayLoveStart = LocalDateTime.now();
		Scanner ip = new Scanner(System.in);
		System.out.print("Input year start love: ");
		int year = ip.nextInt();
		System.out.print("Input month start love: ");
		int month = ip.nextInt();
		System.out.print("Input day start love: ");
		int day = ip.nextInt();
		System.out.print("Input hour start love: ");
		int hour = ip.nextInt();
		System.out.print("Input minute start love: ");
		int minute = ip.nextInt();
		System.out.print("Input second start love: ");
		int second = ip.nextInt();
		LocalDateTime dayLoveStart = LocalDateTime.of(year, month, day, hour, minute, second);
		DateTimeUtils.dayOfWeekFromADay(dayLoveStart);
		System.out.println("=======================");
		System.out.println("Broke up?");
		System.out.println("1. No");
		System.out.println("2. Yes");
		System.out.println("=======================");
		int k = 0;
		System.out.print("Choose choice: ");
		k = ip.nextInt();
		switch (k) {
		case 1: {
			LocalDateTime dayNow = LocalDateTime.now();
			DateTimeUtils.timeLoved(dayLoveStart, dayNow);
			break;
		}
		case 2: {
			System.out.print("Input year end love: ");
			int yearEnd = ip.nextInt();
			System.out.print("Input month end love: ");
			int monthEnd = ip.nextInt();
			System.out.print("Input day end love: ");
			int dayEnd = ip.nextInt();
			System.out.print("Input hour end love: ");
			int hourEnd = ip.nextInt();
			System.out.print("Input minute end love: ");
			int minuteEnd = ip.nextInt();
			System.out.print("Input second end love: ");
			int secondEnd = ip.nextInt();
			LocalDateTime dayLoveEnd = LocalDateTime.of(yearEnd, monthEnd, dayEnd, hourEnd, minuteEnd, secondEnd);
			DateTimeUtils.timeLoved(dayLoveStart, dayLoveEnd);
			break;
		}
		}
	}
}
