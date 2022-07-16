import java.util.Calendar;
import java.util.Scanner;

/**
 * Xây dựng ứng dụng The Ultimate Relationship Calculator
	Nhập thời gian bắt đầu hẹn hò của 2 người.
	Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
	Nhấn Enter để thực hiện tính toán. Hỏi
	Ngày bắt đầu hẹn họ là ngày thứ mấy.
	Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int check = 0;
		
		Calendar startDay = Calendar.getInstance();
		System.out.println("Enter start day: ");
		try {
			System.out.print("Day: ");
			startDay.set(Calendar.DATE, Integer.parseInt(input.nextLine()));
			System.out.print("Month: ");
			startDay.set(Calendar.MONTH,Integer.parseInt(input.nextLine())-1);
			System.out.print("Year: ");
			startDay.set(Calendar.YEAR, Integer.parseInt(input.nextLine()));
		} catch (Exception e) {
			System.out.println("Input date is not valid!!!");
		}
		
		System.out.println("Did you guys break up? \nEnter 'Y' for Yes 'N' for No: ");
		String breakUp = input.nextLine();
		breakUp.toUpperCase();
		if("Y".equals(breakUp)) {
			System.out.println("Enter break up date: ");
			try {
				Calendar finishDay = Calendar.getInstance();
				System.out.print("Day: ");
				finishDay.set(Calendar.DATE, Integer.parseInt(input.nextLine()));
				System.out.print("Month: ");
				finishDay.set(Calendar.MONTH,Integer.parseInt(input.nextLine()) - 1);
				System.out.print("Year: ");
				finishDay.set(Calendar.YEAR, Integer.parseInt(input.nextLine()));
				calculate(startDay, finishDay);
			} catch (Exception e) {
				System.out.println("Input date is not valid");
			}
			
			
		} else {
			Calendar currentDay = Calendar.getInstance();
			calculate(startDay, currentDay);
		}
	}
	private static void calculate(Calendar start, Calendar finish) {
		int year = finish.get(Calendar.YEAR) - start.get(Calendar.YEAR);
		int days = 365*year - start.get(Calendar.DAY_OF_YEAR) + finish.get(Calendar.DAY_OF_YEAR) ;
		String[] dayOfWeeks = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư","Thứ Năm","Thứ Sáu","Thứ Bảy"};
		System.out.println("Start day is : " + dayOfWeeks[start.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println("Your relationship: ");
		System.out.println( year + " Year(s) " + days%365 + " days");
		System.out.println( days + " days");
		System.out.println( days*24 + " hours");
		System.out.println( days*24*60 + " minutes");
		System.out.println( days*24*60*60 + " seconds");
	}
}
