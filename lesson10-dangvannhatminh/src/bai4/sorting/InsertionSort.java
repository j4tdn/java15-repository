package bai4.sorting;

import java.util.Comparator;

import bai4.bean.Student;
import bai4.utils.Swap;

public class InsertionSort {
	public static void sort(Student[] source, Comparator<Student> helper)
	{
		for(int i = 0 ; i< source.length ; i++)
		{
			for(int j= i+1; j <source.length ; j++)
			{
				if(helper.compare(source[i], source[j]) > 0)
				{
					Swap.swap(source, i, j);
				}
			}
		}
	}
}
