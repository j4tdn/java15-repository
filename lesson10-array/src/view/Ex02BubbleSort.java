package view;

import java.util.Arrays;

import utils.CompareHelper;
import utils.SortUtils;

public class Ex02BubbleSort {

	public static void main(String[] args) {
		int[] numbers = {1,5,11,9,4,6};

		// anonymous class
		sort(numbers, new CompareHelper() {
			
			public boolean compare(int prev, int next) {
				return prev > next;
			}
		});
		// lambda expression
		sort(numbers, (int prev,int  next) -> {
			return prev < next;
		});
		System.out.println(Arrays.toString(numbers));
		// short lambda expression
		sort(numbers, (int prev,int  next) -> prev < next);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void sort(int[] source, CompareHelper helper)
	{
		for(int round = 0 ; round < source.length ; round++)
		{
			for(int i = 0 ; i < source.length - round - 1; i++)
			{
				if(helper.compare(source[i], source[i+1]))
				{
					SortUtils.swap(source,i,i+1);
				}
			}
		}
	}
	private static void sort(int[] source)
	{
		for(int round = 0 ; round < source.length ; round++)
		{
			for(int i = 0 ; i < source.length - round - 1; i++)
			{
				if(source[i] > source[i+1])
				{
					SortUtils.swap(source,i,i+1);
				}
			}
		}
	}
}
