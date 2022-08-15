package bai4.sorting;

import java.util.Comparator;

import bai4.bean.Student;
import bai4.utils.Swap;

public class SelectionSort {
	public static void sort(Student[] source, Comparator<Student> helper)
	{
		for(int round = source.length -1 ; round > 0; round --)
		{
			for(int i = 0 ; i < round ; i++)
			{
				if(helper.compare(source[i], source[round]) > 0)
				{
					Swap.swap(source, round, i);
				}
			}
		}
	}
}
