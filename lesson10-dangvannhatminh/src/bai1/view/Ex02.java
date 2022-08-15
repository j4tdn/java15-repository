package bai1.view;

import java.util.Arrays;

public class Ex02 {
	public static void compareAverageArray(int[] source)
	{
		int length = source.length;
		double firstArrayValue = calAverageArray(Arrays.copyOfRange(source, 0, length/2));
		double secondArrayValue = calAverageArray(
								Arrays.copyOfRange(source, (length % 2 == 0) ? length/2 : length/2 +1, length)
									);
		System.out.println(firstArrayValue + " " + secondArrayValue);
	}
	public static double calAverageArray(int[] source)
	{
		double result =0;
		for(int i=0;i<source.length;i++)
		{
			result += source[i];
		}
		return result/source.length;
	}
	public static void main(String[] args) {
		int[] source = {1,2,3,4,3,1,2};
		compareAverageArray(source);
	}
}
