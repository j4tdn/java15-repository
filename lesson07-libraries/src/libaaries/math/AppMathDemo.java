package libaaries.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AppMathDemo {
	public static void main(String[] args) {
		//round, round up, round down, round commercial
		
		double value = 121.52314d;
		
		System.out.println("Value: " +value);
		
		System.out.println("rounding: " +Math.round(value));
		System.out.println("rounding: " +Math.ceil(value));// round up
		System.out.println("rounding: " +Math.floor(value)); //round down
		
		
		//big number, add, subtract, multiply, divide, rounding
		//bigInteger
		//BigDecimal
		
		BigDecimal a = BigDecimal.valueOf(235.6374);
		BigDecimal b = BigDecimal.valueOf(12.555);
		
		a = a.setScale(3, RoundingMode.HALF_UP);
		
		BigDecimal result = a.multiply(a.add(b).divide(b, 2, RoundingMode.HALF_UP));
		
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("result: " + result);
		
		
		double hugValue = 123124123432348345d;
		System.out.println("hugvalue " + hugValue);
		
		BigDecimal huge = BigDecimal.valueOf(hugValue);
		System.out.println("huge " + huge);
	}
}
