package structure.array;

import java.util.Arrays;

/**
 * tìm những phần tử lẻ trong mảng số nguyên 
 * @author nguye
 *
 */
public class Ex02 {

	public static void main(String[] args) {
		int[]numbers = {1,2,3,4,5,6,7};
	int[]oddNumbers = findOddNumbers(numbers);
	System.out.println(Arrays.toString(oddNumbers));
	}
private static int[] findOddNumbers(int[]elements){
	int[] oddElements = new int[elements.length];
	int cout = 0;
	for(int element: elements) {
		if(element %2 != 0) {
			oddElements[cout] = element;
			cout++;
		}
	}
	int [] result = new int [cout];
	for(int i = 0; i < cout;i++) {
		result[i] = oddElements[i]; 
				}
	return result;
}
}
