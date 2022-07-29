package libraries.dformat;

import java.text.DecimalFormat;

public class AppDecimalFormatDemo {
	public static void main(String[] args) {
		double value = 11234528572387.433d;
		System.out.println(value);
		
		// 0 #: phần nguyên, thập phân
		// , : gôm nhóm cho phần nguyên 
		// . ngăn cách phần nguyên và thập phân
		// best practice: phần nguyên --> # , 
		//				: phần thập phân --> . # 0
		// pattern , truoc , sau
		// Nên chỉnh locale mặc định trên code để không xảy ra hiện tượng khác format 12.123,12
		String pattern = "#,###.0000";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted: " + df.format(value));
		
	}
}
