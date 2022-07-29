package libraries.dformat;

import java.text.DecimalFormat;
import java.util.Locale;

public class AppDecimalFormatDemo {
	public static void main(String[] args) {
        double value = 2346789123456.789d;
        System.out.println("value:" + value);
        
        // 0 # : Phan nguyen , thap phan
        // , : ngan cach cho phan nguyen
        // . : ngan cach cho phan nguyen va thap phan
        // tieu chuan : phan nguyen --> #,
        //              phan khong --> #0.
        Locale.setDefault(new Locale("da","DK"));
        String pattern = "#,###.000";
        DecimalFormat df = new DecimalFormat(pattern);
        System.out.println("formatted :" + df.format(value));
	}
}
