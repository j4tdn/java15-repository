package bai4.sorting;

import java.util.Comparator;

import bai4.bean.Student;
import bai4.utils.Swap;

public class QuickSort {
	public static void sort(Student[] source,int first,int last, Comparator<Student> helper) {
		if(first < last)
		{
			int splitpoint = partition(source, first, last, helper);
			
			sort(source, first, splitpoint - 1, helper);
			sort(source, splitpoint + 1 , last, helper);
			
		}
	}
	public static int partition(Student[] source,int first,int last, Comparator<Student> helper)
	{
		int pivot = first;
		int i = first + 1;
		int j = last;
		while(true)
		{
			while(i <= j && helper.compare(source[i], source[pivot]) <= 0 )
			{
				i++;
			}
			while(helper.compare(source[pivot], source[j]) <= 0 && i <= j)
			{
				j--;
			}
			if(j < i) break;
			else
			{
				Swap.swap(source,i,j);
			}
		}
		Swap.swap(source,pivot,j);
		return j;
	}
}
