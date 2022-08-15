package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = {1,2,1,3,1,4,3,1,2,5,2};
		delete(arr);
		System.out.println();
		compare(arr);
	}
	public static void delete(int[] array) {
		int[] source = array;
		int n = source.length;
		int max = 0;
		for (int i = 0; i<source.length;i++) {
			if (max<source[i]) {
				max = source[i];
			}
		}
		int[] maximum = new int[max];
		for (int i = 0; i<source.length;i++) {
			maximum[source[i]]++;
		}
		for (int i = 0; i<source.length;i++) {
			if (maximum[source[i]] == 1) {
				System.out.print(source[i]+"; ");
			}
		}
	}
	public static double total(int[] array)
	{
		int s =0;
		for(int i=0;i<array.length;i++)
		{
			s += array[i];
		}
		return s/array.length;
	}
	public static void compare(int[] array)
	{
		int n = array.length;
		double array1 = total(Arrays.copyOfRange(array, 0, n/2));
		double array2 = total(Arrays.copyOfRange(array, (n % 2 == 0) ? n/2 : n/2 +1, n));
		if (array1 < array2) {
		System.out.println("Array1 = "+ array1 + " < " +"Array2 = "+ array2);
		} else {
			System.out.println("Array1 = "+ array1 + " > " +"Array2 = "+ array2);
		}
	}
}
