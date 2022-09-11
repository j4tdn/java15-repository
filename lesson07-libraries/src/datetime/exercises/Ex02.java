package datetime.exercises;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int dOfY = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("Day of this year : " + dOfY);
		int dOfM = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Day of this Month : " + dOfM);
	}
}
