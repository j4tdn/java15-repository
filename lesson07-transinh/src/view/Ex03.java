package view;
/**
  Viết chương trình, mỗi chức năng một phương thức
	1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
*/
import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Ex03 {
	
	public static Calendar getInstance(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	
	public static String between(Calendar start, Calendar end) {
		if(start.after(end)) {
			throw new IllegalArgumentException("start date cannot exceed end date !");
		}
		
		//long -> milieseconds ->end - start
		//milliseconds -> "year , month"day,hour,minute,second
		
		long startInMils = start.getTimeInMillis();
		long endInMils=end.getTimeInMillis();
		
		long duration = endInMils - startInMils; //milliseconds
		
		long days = TimeUnit.MILLISECONDS.toDays(duration);
		duration -= TimeUnit.DAYS.toMillis(days);
		
		return days +" D ";
	}
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//1. Xem thời gian hiện tại(dd/MM/yyyy HH:mm:ss) ở khu vực bất kỳ.
		Locale.setDefault(Locale.US);
		System.out.println("Default locale: " + Locale.getDefault());
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String dateFormat = df.format(date);
		System.out.println("Ngày hiện tại: " + dateFormat);

		// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		int finalDayOfMonth = cal.getActualMaximum(Calendar.DATE);
		System.out.println("Ngày cuối cùng của tháng là: " + finalDayOfMonth);
		
		// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm
		int numberWeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Đây là tuần thứ " + numberWeekOfYear + " trong năm");
		
		// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		Scanner input = new Scanner( System.in );
		System.out.println("Nhập ngày sinh: ");
		int a = input.nextInt();
		System.out.println("Nhập tháng sinh: ");
		int b = input.nextInt();
		System.out.println("Nhạp năm sinh: ");
		int c = input.nextInt();
		Calendar start = getInstance(a, b, c);
		String duration = between(start, cal);
		System.out.println("Số ngày đã sống được: " + duration);
	}
}