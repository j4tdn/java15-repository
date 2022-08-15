package bai4.utils;

import bai4.bean.Student;

public class Swap {
	public static void swap(Student[] source, int a , int b)
	{
		Student temp = source[a];
		source[a] = source[b];
		source[b] = temp;
	}
}
