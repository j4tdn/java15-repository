package exercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

/**
 * Hoàng và Lan yêu nhau đã được chừng ấy năm
 * Ngày bắt đầu: 20/02/2014
 * Kiểm tra xem 2 bạn đã yêu nhau được bao nhiêu Ngày – Giờ - Phút - Giây
 */
public class Ex07DatingTime {
	public static void main(String[] args) {
	Calendar start=DateUtils.getInstance(20, Calendar.APRIL, 2020, 10, 20, 30);
	Calendar now=Calendar.getInstance();
	
	String duration = DateUtils.between(start, now);
	System.out.println("duration: "+ duration);
	
	
	}
	
}
