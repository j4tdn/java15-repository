package datetime.exercises;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import Util.DateUtils;

public class Ex04AQ {

	public static void main(String[] args) {
		// Đưa thứ ngày vào khuôn 01/08/2022 Mon
		DateFormat 	df= new SimpleDateFormat("dd/MM/yyyy E");
		// lấy thời gian hiện tại ra
		Calendar c = DateUtils.getIntance(Calendar.AUGUST, 2022);
		// lấy số ngày trong thantgs
		int dateInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for(int day =1 ; day <= dateInMonth; day ++) {
			c.set(Calendar.DAY_OF_MONTH, day);
			String formatted = df.format(c.getTime());
			System.out.println(formatted);
		}
		
	}

}
