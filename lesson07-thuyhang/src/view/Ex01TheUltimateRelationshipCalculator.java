package view;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
		private static String[] dayOfWeeks;
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);

			Calendar startDay = Calendar.getInstance();
			System.out.println("Enter date start dating: ");
				try {
					startDay.set(Calendar.DATE, Integer.parseInt(ip.nextLine()));
					System.out.println("Day: ");
					startDay.set(Calendar.MONTH, Integer.parseInt(ip.nextLine())-1);
					System.out.println("Month: ");
					startDay.set(Calendar.YEAR, Integer.parseInt(ip.nextLine()));
					System.out.println("Year: ");

				}catch (Exception ex) {
					System.out.println("Input DateFormat DD/MM/YYYY: ");
			}
				System.out.println("Did you guys break up? Enter 'Y' for Yes 'N' for No: ");

				String breakUp = ip.nextLine();
				breakUp.toUpperCase();
				if("Y".equals(breakUp)) {
					System.out.println("Enter break up date: ");
					try {
						Calendar end = Calendar.getInstance();
						end.set(Calendar.DAY_OF_MONTH, Integer.parseInt(ip.nextLine()));
						end.set(Calendar.MONTH, Integer.parseInt(ip.nextLine()));
						end.set(Calendar.YEAR, Integer.parseInt(ip.nextLine()));
						calculator(startDay, end);
					}catch (Exception ex) {
						System.out.println("Input DateFormat DD/MM/YYYY: ");
					}

				}	else {
						Calendar currentDay = Calendar.getInstance();
						calculator(startDay,currentDay);
				}
		}
				private static void calculator(Calendar start, Calendar end) {
					int years = end.get(Calendar.YEAR) - start.get(Calendar.YEAR);
					int days = years * 365 -(start.get(Calendar.DAY_OF_YEAR) + end.get(Calendar.DAY_OF_YEAR));
					int hours = days *24;
					int minutes = hours * 60;
					int seconds = minutes *60;

					System.out.println("Start day is: " + dayOfWeeks [start.get(Calendar.DAY_OF_WEEK) - 1]);
					System.out.println("Your relationship has been start: ");
					System.out.println(years + "Year(s)" + "Days" + hours + "Hours" + minutes + "Minutes" + seconds + "Seconds");

				}
		}



