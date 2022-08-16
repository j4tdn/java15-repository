package sorting;

import utils.CompareIntHelper;
import static utils.CrudUtils.*;

import java.util.Iterator;


public class SortingInt {
	private SortingInt() {
		
	}
	//Bubble Sort
	public static void sortBubble(int[] source, CompareIntHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for(int i = 0; i < source.length - round - 1; i++) {
				if(helper.compare(source[i], source[i+1])) {
					swap(source, i, i+1);
				}
			}
		}
	}
	//SelectionSort
	public static void sortSelection(int[] source, CompareIntHelper helper) {
		for(int round = source.length - 1; round > 0; round--) {
			for(int i = 0; i < round; i++) {
				if(helper.compare(source[round], source[i])) {
					swap(source, round, i);
				}
			}
		}
		
	}
	//InsertionSort
	public static void sortInsetion(int[] source, CompareIntHelper helper) {
		for(int round = 1; round < source.length; round++) {
			for(int i = 0; i < round; i++) {
				if(helper.compare(source[round], source[i])) {
					swap(source, round, i);
				}
			}
		}
	}
}
