package view;

import java.util.Calendar;

import common.Holiday;
import utils.Dateutils;

public class FindDealineDate {
	private static final int BUDGET = 110;
	public static void main(String[] args) {
		

	
		Calendar c = Dateutils.getInstance(7, Calendar.JUNE, 2022);
		int implemetedDates = 0;
		while(true ) {
			int weekday = c.get(Calendar.DAY_OF_WEEK);
		
			boolean isDayOff = (weekday == Calendar.SATURDAY|| weekday == Calendar.SUNDAY ||Dateutils.isHoliday(c, Holiday.getVnmseHolidays()));
			if(!isDayOff) {
				implemetedDates++;
				if(implemetedDates == BUDGET) {
					break;
				}
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("deadline: "+ Dateutils.format("dd/MM/yyyy", c.getTime()));
		
	}
}
