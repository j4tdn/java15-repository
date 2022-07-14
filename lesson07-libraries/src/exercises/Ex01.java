package exercises;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2022);
		if(c.get(Calendar.YEAR) % 4 == 0 && c.get(Calendar.YEAR) % 100 != 0) {
			System.out.println("Năm " + c.get(Calendar.YEAR) + " là năm nhuận");
		}
		else {
			System.out.println("Năm " + c.get(Calendar.YEAR) + " là năm không nhuận.");

		}
		
		
		
	}
}
