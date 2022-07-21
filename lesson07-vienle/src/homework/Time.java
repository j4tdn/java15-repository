package homework;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;

	public class Time {
		private static String[] dayOfWeeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
				"Saturday" };

		public static void main(String[] args) {
			System.out.println("The present time: ");
			presentTime();
			lastDayOfMonth();
			firstAndLastDayOfWeek();
			weekOfYear();
			checkDayAfter(20);
			howLongYouAlive();
		}

		private static void howLongYouAlive() {
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy");
			Calendar c = Calendar.getInstance();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Input your birthday: ");
			String input = sc.nextLine();
			
			try {
				c.setTime(s.parse(input));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			Date dob = c.getTime();
			Date now = new Date();
			long remaining = now.getTime() - dob.getTime();
			long numberOfDays = remaining / (1000 * 60 * 60 * 24);
			System.out.println("You was alive " + numberOfDays);

		}

		private static void checkDayAfter(int days) {
			Calendar c = Calendar.getInstance();
			Calendar after = Calendar.getInstance();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy");

			after.setTimeInMillis(c.getTimeInMillis());
			after.add(Calendar.DAY_OF_MONTH, days);

			int dow = c.get(Calendar.DAY_OF_WEEK);
			String dowString = dayOfWeeks[dow - 1];

			System.out.println("After " + days + " days is " + s.format(after.getTime()) + ", " + dowString);
		}

		private static void weekOfYear() {
			Calendar c = Calendar.getInstance();
			System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		}

		private static void firstAndLastDayOfWeek() {
			Calendar c = Calendar.getInstance();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy");
			Calendar first = Calendar.getInstance();
			first.setTimeInMillis(c.getTimeInMillis());
			first.add(Calendar.DAY_OF_MONTH, 1 - first.get(Calendar.DAY_OF_WEEK));
			Date firstDate = first.getTime();

			Calendar last = Calendar.getInstance();
			last.setTimeInMillis(first.getTimeInMillis());
			last.add(Calendar.DAY_OF_MONTH, 6);
			Date lastDate = last.getTime();
			System.out.println("First day is: " + s.format(firstDate));
			System.out.println("Last day is: " + s.format(lastDate));

		}

		private static void lastDayOfMonth() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy");
			System.out.println(s.format(c.getTime()));
		}

		private static void presentTime() {
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
			Calendar c = Calendar.getInstance();
			System.out.println(s.format(c.getTime()));
		}
}
