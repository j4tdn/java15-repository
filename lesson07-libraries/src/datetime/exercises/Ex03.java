package datetime.exercises;

import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int dOW = c.get(Calendar.DAY_OF_WEEK);
		int year = c.get(Calendar.YEAR);
		
		System.out.println(year);
		switch (dOW) {
		case 1:
			System.out.println("CHỦ NHẬT");
			break;
		case 2:
			System.out.println("THỨ HAI");
			break;
		case 3:
			System.out.println("THỨ BA");
			break;
		case 4:
			System.out.println("THỨ TƯ");
			break;
		case 5:
			System.out.println("THỨ NĂM");
			break;
		case 6:
			System.out.println("THỨ SÁU");
			break;
		case 7:
			System.out.println("THỨ BẢY");
			break;
		}
		System.out.println(c.getTime());

	}
}
