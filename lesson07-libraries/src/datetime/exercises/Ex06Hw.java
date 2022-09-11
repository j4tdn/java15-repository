package datetime.exercises;

import java.util.Calendar;

import utils.DateUtils;

public class Ex06Hw {
	private static final int BEDGET = 110;

	public static void main(String[] args) {
		Calendar cal = DateUtils.getInstant(2022, Calendar.JULY, 10);
		int implementedDates = 0;
		
		while (true) {

			int weekDay = cal.get(Calendar.DAY_OF_WEEK);
			boolean dayOff = (weekDay == Calendar.SATURDAY || weekDay == Calendar.SUNDAY);
			
			if (!dayOff) {
				implementedDates++;
				if (implementedDates == BEDGET) {
					break;
				}

			}
			cal.add(Calendar.DAY_OF_YEAR, 1);

		}
		System.out.println("deadline, " + DateUtils.format("dd/MM/yyyy", cal.getTime()));
	}
}
