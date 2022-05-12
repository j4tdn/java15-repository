package structure.array;

import java.util.Arrays;

/**
 * 
 *1. tìm những phần tử lẻ trong mảng số nguyên
 *	 Input:mảng
 *	 Output:mảng số lẻ
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers= {23,25,16,33,66};
		int[] oddNumbers=findOddnumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	
	private static int[] findOddnumbers(int[] elements) {
		int[] oddElements = new int[elements.length];
		int count=0;
		for (int element:elements) {
			if(element %2 !=0) {
				oddElements[count]=element;
				count++;
			}
		}
		int[]result =new int[count];
		for (int i=0;i<count;i++) {
			result[i]=oddElements[i];
		}
		return result;
	}
	
}
