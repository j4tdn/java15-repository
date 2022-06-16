package view;

import java.util.Arrays;

import utils.ArrayUtils;

/**
 * Cho mảng A gồm n phần tử (2 < n < 20). Ak = [0, 100]
Viết hàm liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong mảng. Kết quả
trả về được sắp xếp tăng dần.
Input: 3, 15, 21, 0, 15, 17, 21
Output: 0, 3, 17
 * */
public class Ex04UniqueNumbers {
	public static void main(String[] args) {
		int[] elements = { 3, 15, 21, 0, 15, 17, 21};
		int[] foundElements = getUniqueElements(elements);
		ArrayUtils.printf(foundElements);
	}
	
	private static int[] getUniqueElements(int[] elements) {
		boolean[] flags = new boolean[elements.length];
		
		for(int pivotIndex = 0; pivotIndex < elements.length; pivotIndex++) {
			if(flags[pivotIndex])
				continue;
			
			for(int i = 0; i < elements.length; i++) {
				if(pivotIndex != i && elements[pivotIndex] == elements[i]) {
					flags[pivotIndex] = true;
					flags[i] = true;
				}
			}
		}
		
		int[] result = new int[elements.length];
		int count = 0;
		for(int i = 0; i < flags.length; i++) {
			if(!flags[i]) {
				result[count++] = elements[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
