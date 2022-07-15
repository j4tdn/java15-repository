package datetime.exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import utils.DateUtils;

/*
 * A và B quen nhau đã được chừng ấy năm
 Ngày bắt đầu: 20/04/2020 10:20:30
 Kiểm tra xem 2 bạn đã yêu nhau được bao nhiêu
 Năm – Tháng >> Ngày – Giờ - Phút - Giây
 * */

public class Ex07DatingTime {
	public static void main(String[] args) {
		/*
		 * Calendar now = Calendar.getInstance();
		 * 
		 * Calendar dayLove = Calendar.getInstance(); dayLove.set(2020, Calendar.APRIL,
		 * 20, 10, 20, 30);
		 * 
		 * long timeLove = now.getTimeInMillis() - dayLove.getTimeInMillis();
		 * System.out.println(timeLove);
		 * 
		 * Calendar timeLoved = Calendar.getInstance();
		 * timeLoved.setTimeInMillis(timeLove);
		 * 
		 * 
		 * 
		 * DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); String formatted
		 * = df.format(timeLoved.getTime());
		 * 
		 * System.out.println(formatted);
		 */
		
		Calendar start = DateUtils.getInstance(20, Calendar.APRIL, 2020, 10, 20, 30);
		Calendar now = Calendar.getInstance();
		
		String duration = DateUtils.between(start, now);
		System.out.println("duration: " + duration);
	}
}
