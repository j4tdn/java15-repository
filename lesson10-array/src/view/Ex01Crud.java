package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = {1,9,5,36,12,33};
		int[] addedArray = insert(numbers, 3, 99);
		System.out.println(Arrays.toString(addedArray));
		int[] rmArray = remove(numbers, 3);
		System.out.println(Arrays.toString(rmArray));
	}
	private static int[] insert(int[] source, int pos,int newValue)
	{
		int[] target = new int[source.length+1];
		for(int i = 0; i < source.length;i++)
		{
			target[i] = source[i];
		}
		for(int i = target.length-1; i > pos ; i--)
		{
			target[i] = target[i-1];
		}
		target[pos] = newValue;
		return target;
	}
	private static int[] add(int[] source, int pos,int newValue)
	{
		int[] target = new int[source.length+1];
		for(int i = 0; i < target.length;i++)
		{
			if(i > pos)
			{
				target[i] = source[i-1];
			} else if (i == pos)
			{
				target[i] = newValue;
			} else {
				target[i] = source[i];
			}
		}
		return target;
	}
	private static int[] remove(int[] source, int pos)
	{
		int[] target = new int[source.length-1];
		for(int i = 0; i < target.length;i++)
		{
			if(i >= pos)
			{
				target[i] = source[i+1];
			}
			else {
				target[i] = source[i];
			}
		}
		return target;
	}
}
