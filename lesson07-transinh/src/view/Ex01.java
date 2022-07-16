package view;
/**
 * Xây dựng ứng dụng The Ultimate Relationship Calculator
 	Nhập thời gian bắt đầu hẹn hò của 2 người.
 	Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
 	Nhấn Enter để thực hiện tính toán. Hỏi
 	Ngày bắt đầu hẹn họ là ngày thứ mấy.
 	Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.println("Nhap ngay: ");
		int a = input.nextInt();
		System.out.println("Nhap thang: ");
		int b = input.nextInt();
		System.out.println("Nhap nam: ");
		int c = input.nextInt();
		LocalDate dateStart = LocalDate.now().withDayOfMonth(a).withMonth(b).withYear(c);
		System.out.println("dateStart: " + dateStart);

		LocalDate dateEnd = LocalDate.now();

		if (dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end");
		}
		Period period = Period.between(dateStart, dateEnd);
		//System.out.println("period: " + period);
		System.out.println("Thoi gian:" + optional(period.getYears(), "years") + optional(period.getMonths(), "months")
				+ optional(period.getDays(), "days")/*+optional(period.getHours(), "hours")+optional(period.getMinutes(), "days")
				+ optional(period.getSeconds(), "seconds")*/);
	}

	private static String optional(int dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit + " " : " ";
	}
}