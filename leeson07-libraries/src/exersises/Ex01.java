package exersises;

import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

	}

	public boolean check(Calendar calendar) {
		if (calendar.get(Calendar.YEAR) % 400 == 0) {
			return true;

		}
		if (calendar.get(Calendar.YEAR) % 4 == 0 && calendar.get(Calendar.YEAR) % 100 != 0) {
			return true;
		}
		return false;

	}

}
