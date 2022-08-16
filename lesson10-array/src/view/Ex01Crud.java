package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		int[] a = insert(numbers, 1, 3);
		int[] b = remove(numbers, 1);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
	
	private static int[] insert(int elements[], int pos, int newValue) {
		int[] newelements = new int[elements.length+1];
/*		for(int i = 0; i < elements.length;i++) newelements[i] = elements[i];
		for(int i = elements.length; i>=pos;i--) {
			newelements[i] = newelements[i-1];
		}
		newelements[pos] = newValue;
*/	
		for(int i = 0; i< pos;i++ ) newelements[i] = elements[i];
		newelements[pos] = newValue;
		for(int i = pos+1; i< newelements.length;i++ ) newelements[i] = elements[i-1];
		return newelements;
	}
	
	private static int[] remove(int elements[], int pos) {
		int[] newelements = new int[elements.length-1];
		for(int i = 0; i < pos;i++) newelements[i] = elements[i];
		for(int i = pos;i < newelements.length;i++) newelements[i] = elements[i+1];
		return newelements;
	}
}
