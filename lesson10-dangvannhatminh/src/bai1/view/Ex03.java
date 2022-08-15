package bai1.view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static int findThirdMaxItems(Integer[] source)
	{
		Integer[] result = source;
		Arrays.sort(result, Comparator.reverseOrder());
		int count = 1;
		int max = source[0];
		for(int i=1; i<result.length;i++)
		{
			if(max != source[i]) 
			{
				max = source[i];
				count++;
			}
			if(count == 3) return max;
		}
		return max;
	}
	public static void main(String[] args) {
		Integer[] source = {7, 8, 8, 8, 6, 2, 5, 1};
		System.out.println(findThirdMaxItems(source));
	}

}
