package homework;

import java.util.Calendar;
import java.util.Scanner;

public class TheUltimateRelationshipCalculator {
	private static String[] dayOfWeeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
			"Saturday" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String isContinue = "y";
		do {
			try {
				System.out.println("Enter the day start: ");
				Calendar startDay = Calendar.getInstance();
				startDay.set(Calendar.DAY_OF_MONTH, Integer.parseInt(sc.nextLine()));
				startDay.set(Calendar.MONTH, Integer.parseInt(sc.nextLine()));
				startDay.set(Calendar.YEAR, Integer.parseInt(sc.nextLine()));
				System.out.println("Did you breakup or not ? [Y/N]");
				System.out.println("1. Broke Up");
				System.out.println("2. Not yet");
				int answer = Integer.parseInt(sc.nextLine());
				switch (answer) {
				case 1:
					System.out.println("Enter the broke up day: ");
					Calendar end = Calendar.getInstance();
					end.set(Calendar.DAY_OF_MONTH, Integer.parseInt(sc.nextLine()));
					end.set(Calendar.MONTH, Integer.parseInt(sc.nextLine()));
					end.set(Calendar.YEAR, Integer.parseInt(sc.nextLine()));
					calculator(startDay, end);
					break;
				case 2:
					Calendar current = Calendar.getInstance();
					calculator(startDay, current);
					break;
				}

			} catch (Exception e) {
				System.out.println("Input is invalid, try again !");
			} finally {
				System.out.println("Do you want try again ? [Y/N]");
				isContinue = sc.nextLine();
			}

		} while ("y".equalsIgnoreCase(isContinue));
	}

	public static void calculator(Calendar start, Calendar end) {
		int years = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int days = years * 365 - (start.get(Calendar.DAY_OF_YEAR) + end.get(Calendar.DAY_OF_YEAR));
		int hours = days * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;

		System.out.println("The day of week when begin loves: " + dayOfWeeks[start.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("The love has been started: ");
		System.out.println(years + " Year(s) " + (days % 365) + " Days " + hours + " Hours " + minutes + " Minutes "
				+ seconds + " Seconds");
	}
}
