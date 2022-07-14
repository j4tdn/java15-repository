package datetimeexercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex06_DeadlineDay {
	private static final int BUDGET = 11;
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String cDateFormat = df.format(FinishDay());
		System.out.println("Ngày giao dự án là: " + cDateFormat);
	}

	private static Date FinishDay() {
		String[] dayoff = { "01/01", "30/04", "01/05", "02/09" };
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat dfa = new SimpleDateFormat("dd/MM");
		int count = 0;
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JULY, 10);
		int month = c.get(Calendar.MONTH);
		int days = c.get(Calendar.DAY_OF_MONTH);
		int daymax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int k = c.get(Calendar.YEAR); k > 0; k++) {
			c.set(Calendar.YEAR, k);
			for (int i = month; i <= 11; i++) {
				c.set(Calendar.MONTH, i);
				daymax = c.getActualMaximum(Calendar.DAY_OF_MONTH);
				for (int j = days; j <= daymax; j++) {
					c.set(Calendar.DAY_OF_MONTH, j);
					count++;
					Date date = c.getTime();
					String cDateFormat = dfa.format(date);
				//	System.out.println(cDateFormat);
					for (int l = 0; l < dayoff.length; l++) {
					//	System.out.println(cDateFormat + "," + dayoff[l]);
						if (cDateFormat.equals(dayoff[l])) {
							count--;
						}
					}
					if (c.get(Calendar.DAY_OF_WEEK) == 1 || c.get(Calendar.DAY_OF_WEEK) == 7) {
						count--;
					}

					if (count == BUDGET) {
						date = c.getTime();
						//cDateFormat = df.format(date);
						return date;
					}
				}
				days = 1;

			}
			month = 0;
		}
		return null ;
	}
}