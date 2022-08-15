package bai3.view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
	
	public static void getASCString(String[] source,String specialString)
	{	
		Arrays.sort(source,Comparator.nullsLast((String s1, String s2) -> {
			if(s1.equals(specialString))
			{
				return -1;
			}
			if(s2.equals(specialString))
			{
				return 1;
			}
			return s1.compareTo(s2);
		}));
	}
	public static void getDESCString(String[] source,String specialString)
	{
		Arrays.sort(source,Comparator.nullsFirst((String s1, String s2) -> {
			if(s1.equals(specialString) && !s2.equals(specialString))
			{
				return 1;
			}
			if(s2.equals(specialString))
			{
				return -1;
			}
			return s2.compareTo(s1);
		}));
	}
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
				"b", "xx"};
		getDESCString(strings, "Special");
		System.out.println(Arrays.toString(strings));
	}
}
