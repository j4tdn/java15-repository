package view;

import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03BubbleSortWithString {

	public static void main(String[] args) {
		String[] sequences = { "Alex", null , "Terry", "Rivaldo",null, "Blue", "Zill" };
		sortHandleNullFirst(sequences);
		System.out.println(Arrays.toString(sequences));
		System.out.println("========Using strategy=========");
		String[] items = { "Alex","Terry", "Rivaldo", "Blue", "Zill" };
		sort(sequences, (prev,next) -> {
			//NULL first
			if(prev == null)
			{
				return -1;
			} 
			if(next == null)
			{
				return 1;
			}
			return prev.compareTo(next);
		});
		System.out.println(Arrays.toString(sequences));
	}
	//using strategy pattern
	private static void sort(String[] source,CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i+1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
	
	private static void selectionSortKeepCurrentPositionNullValues(String[] source)
	{
		for(int pivot = source.length -1 ; pivot > 0 ; pivot --)
		{
			if(source[pivot] != null)
			{
				for(int i=0; i < pivot ;i++)
				{
					if(source[i] != null)
					{
						if(source[pivot].compareTo(source[i]) < 0)
						{
							SortUtils.swap(source, i, pivot);
						}
					}
				}
			}
		}
	}
	// so sanh tring -> su dung CompareTo
	// B1:Xử lý null values --> Sử dụng null first, null last
	// B2:Sau đó những phần tử khác null --> sx tăng dần hoặc giảm dần
	private static void sortHandleNullFirst(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				//B1: Xử lý null first
				if(source[i] == null) continue;
				if(source[i+1] == null)
				{
					SortUtils.swap(source, i, i + 1);
					continue;
				}
				//B2: Sx tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i+1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
	private static void sortHandleNullLast(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				//B1: Xử lý null last
				if(source[i] == null && source[i+1] != null)
				{
					SortUtils.swap(source, i, i + 1);
					continue;
				}
				if(source[i+1] == null)
				{
					continue;
				}
				//B2: Sx tăng dần cho những phần tử khác null
				if (source[i].compareTo(source[i+1]) < 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
	// so sanh tring -> su dung CompareTo
	private static void sort(String[] source) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (source[i].compareTo(source[i+1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}

}
