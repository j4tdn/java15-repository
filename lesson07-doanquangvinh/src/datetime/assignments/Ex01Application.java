package datetime.assignments;

import java.util.Calendar;
import java.util.Scanner;

import utils.DateUtils;

public class Ex01Application {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner ip = new Scanner(System.in);
		Calendar now = Calendar.getInstance();

		Calendar broken = Calendar.getInstance();
		System.out.println("Press 1 if you are still dating : ");
		System.out.println("Press 2 if you are breaking up : ");
		System.out.println("Press 3 to caculate the First Date When you are dating :");
		System.out.println("Press 4 to caculate the duration :");
		int num = ip.nextInt();
		System.out.print("Enter the date you start dating :");
		int date = ip.nextInt();
		c.set(Calendar.DATE, date);
		System.out.print("Enter the month you start dating :");
		int month = ip.nextInt() - 1;
		c.set(Calendar.MONTH, month);
		System.out.print("Enter the year you start dating :");
		int year = ip.nextInt();
		c.set(Calendar.YEAR, year);
		if (num == 1) {
			System.out.println("The time when couple begin dating is :" + c.getTime());
		} else if (num == 2) {
			System.out.println("Please Enter the time you have broken up :");
			System.out.print("Enter the date when your love is over :");
			date = ip.nextInt();
			broken.set(Calendar.DATE, date);
			System.out.print("Enter the month when your love is over :");
			month = ip.nextInt() - 1;
			broken.set(Calendar.MONTH, month);
			System.out.print("Enter the year when your love is over :");
			year = ip.nextInt();
			broken.set(Calendar.YEAR, year);
			System.out.println("You have broken up since :" + broken.getTime());
			System.out.println("The duration" + DateUtils.between(c, broken));

		} else if (num == 3) {
			System.out.println(c.get(Calendar.DAY_OF_WEEK));

		} else if (num == 4) {
			System.out.print("Enter the hour dating :");
			int hour = ip.nextInt();
			c.set(Calendar.HOUR, hour);
			System.out.print("Enter the minute dating :");
			int minute = ip.nextInt();
			System.out.print("Enter the second dating :");
			c.set(Calendar.MINUTE, minute);
			int second = ip.nextInt();
			c.set(Calendar.SECOND, second);
			System.out.println("The duration :" + DateUtils.between(c, now));
		}
	}
}
