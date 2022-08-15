package bai4.sorting;

import java.util.Comparator;

import bai4.bean.Student;
import bai4.utils.Swap;

public class BubbleSort {
	public static void sort(Student[] source, Comparator<Student> helper) {
		for(int round = 0 ; round < source.length ; round++)
		{
			for(int i = 0; i < source.length - round - 1 ; i++ )
			{
				if(helper.compare(source[i], source[i+1]) > 0)
				{
					Swap.swap(source, i, i+1);
				}
			}
		}
	}
}
