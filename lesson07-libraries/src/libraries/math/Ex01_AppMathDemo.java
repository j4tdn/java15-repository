package libraries.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01_AppMathDemo {
	public static void main(String[] args) {
		double value = 235.5638d;
		System.out.println("Value: " + value);
		System.out.println("Routing: " + Math.round(value));
		System.out.println("Routing: " + Math.ceil(value));//RoudUp
		System.out.println("Routing: " + Math.floor(value));//RoudDown
		BigDecimal a = BigDecimal.valueOf(235.6374);
		BigDecimal b = BigDecimal.valueOf(12.555);
		a = a.setScale(2, RoundingMode.HALF_UP);
		BigDecimal result = a.multiply(a.add(b)).divide(b,3,RoundingMode.HALF_UP);
		System.out.println(a +"," + b );
		System.out.println(result);
		double hugeValue = 12332467634567d;
		System.out.println(hugeValue);
		BigDecimal huge = BigDecimal.valueOf(hugeValue);
		System.out.println(huge);
	}
}
