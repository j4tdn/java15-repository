package exercise;

import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		String[] dateOfWeek = { "chủ nhật", "thứ hai", "thứ ba", "thứ tư", "thứ năm", "thứ sáu", "thứ bảy" };
		Calendar c = Calendar.getInstance();
		for(int i = 1; i < dateOfWeek.length; i++) {
			if(i == c.get(Calendar.DAY_OF_WEEK)) {
				System.out.println(dateOfWeek[i-1]);
			}
		}
	}
}
