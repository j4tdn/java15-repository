package view;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex04UniqueNumbers {
	/** 
	 Option 1: Binh
		Step 1: Loop elements with i from 0 to n
		Step 2: Loop elements with j from 0 to n except i
		      : if (elements[i] == elements[j]) --> non-unique
		      : else for all --> unique
	 Option 2: Hieu
	    Step 1: Loop elements with i from 0 to n
		Step 2: Loop elements with j from 0 to n except i
		      : if (elements[i] == elements[j]) --> elements[i,j] = -1
		Step 3: Print out elements which have value != -1
		
		==> using flags to avoid duplicate check unique
		
	 Option 3: Khoa
	    Step 1: Create array of elements consist of 101 element 0
	          : Represents for amount of display in input array
	    Step 2: Loop elements with i from 0 to n
	            b[a[i]]++ --> Increase amount
	    Step 3: Loop in b array --> print out index of element has value = 1
	    
	    ==> count of amount of each element in array
	    3, 15, 21, 19, 3, 15, 17, 21, 3 ==???
	    ==> 3,3
	        15,2
	        21,2
	        19,1
	        17,1
	*/
	
	public static void main(String[] args) {
		int[] elements = {3, 15, 21, 19, 3, 15, 17, 21};
		int[] foundElements = getUniqueElements(elements);
		
		ArrayUtils.printf(foundElements);
	}
	
	// 3, 15, 21, 19, 3, 15, 17, 21, 3
	// t  t   t   f  t  t   f   t   t
	private static int[] getUniqueElements(int[] elements) {
		boolean[] flags = new boolean[elements.length];
		for (int pivotIndex = 0; pivotIndex < elements.length; pivotIndex++) {
			if (flags[pivotIndex]) continue;
			for (int i = 0; i < elements.length; i++) {
				if (pivotIndex != i && elements[pivotIndex] == elements[i]) {
					flags[pivotIndex] = true;
					flags[i] = true;
				}
			}
		}
		int[] result = new int[elements.length];
		int count = 0;
		for (int i = 0; i < flags.length; i++) {
			if (!flags[i]) {
				result[count++] = elements[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
