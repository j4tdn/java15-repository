package array;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ThoiGian {
	public static void main(String[] args) {
		System.out.println("HOM NAY: "+LocalDate.now());
		long tg = System.currentTimeMillis();
		System.out.println("trc khi chay "+tg);
		for (int i = 0; i < 1200; i++) {
			System.out.println("BAI CA KO QUEN");
			
			
		}
		long tg1 = System.currentTimeMillis();
		
		System.out.println("trc khi chay "+tg1);
		System.out.println("mat bao nhieu "+(tg1-tg));
		Date d= new Date(System.currentTimeMillis());
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));

	}

}
