package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01ListElements {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		int[] arr1 = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		Arrays.sort(arr1);
		System.out.println("=============== Ex1.1 ===============");
		int max1 = Arrays.stream(arr1).max().getAsInt();
		int[] ar = new int[max1 + 1];
		for (int i = 0; i < arr1.length; i++)
			++ar[arr1[i]];
		for (int e : arr1)
			if (ar[e] == 1)
				list1.add(e);
		System.out.println(list1);

		System.out.println("=============== Ex1.2 ===============");
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr2 = { 5, 7, 9, 10, 20, 9, 7, 7, 11 };
		Arrays.sort(arr2);
		int max2 = Arrays.stream(arr2).max().getAsInt();
		int[] ars = new int[max2 + 1];
		for (int i = 0; i < arr2.length; i++)
			++ars[arr2[i]];
		for (int e : arr2)
			if (ars[e] > 1)
				list.add(e);
		Set<Integer> set = new HashSet<Integer>();
		set = Set.copyOf(list);
		System.out.println(set);
	}

}
