package bai4.sorting;

import java.util.Comparator;

import bai4.bean.Student;

public class MergeSort {
	public static void merge(Student[] source, int l , int m , int r, Comparator<Student> helper) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		Student[] leftArr = new Student[n1];
		Student[] rightArr = new Student[n2];
		
		for(int i=0 ; i< n1; i++) {
			leftArr[i] = source[l+i];
		}
		for(int i=0 ; i< n2; i++) {
			rightArr[i] = source[m+1+i];
		}
		
		int k = l , i = 0, j = 0;
		while(i < n1 && j < n2)
		{
			if(helper.compare(leftArr[i], rightArr[j]) > 0)
			{
				source[k++] = rightArr[j++];
			}else
			{
				source[k++] = leftArr[i++];	
			}
		}
		while(i < n1)
		{
			source[k++] = leftArr[i++];
			
		}
		while(i < n2)
		{
			source[k++] = rightArr[j++];
		}
	}
	public static void sort(Student[] source,int left , int right, Comparator<Student> helper)
	{
		if(left < right)
		{
			int middle = (left + right) /2 ;
			sort(source,left,middle,helper);
			sort(source,middle+1,right,helper);
			
			merge(source,left,middle,right,helper);
		}
	}
}
