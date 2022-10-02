package Ex01;

import java.util.Arrays;

public class Ex01Logic {
	public static void main(String[] args) {
         //Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N
		 int[] input1 = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
		 int[] result = OnlyNumberApp(input1);
		 System.out.println(Arrays.toString(result));
		//Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N
		 int[] input2 = {5, 7, 9, 10, 20, 9, 7, 7, 11};
	}
	
	public static int[] OnlyNumberApp(int[] elements) {
		int[] result = new int[elements.length + 1];
		boolean[] flags = new boolean[elements.length];
		int i, j;
		for(i = 0; i < elements.length - 1; i++) {
			for(j = 0; j < elements.length; j++) {
				if(elements[i] == elements[j] && i != j) {
				     flags[i] = true;
				     flags[j] = true;
				}
			}
		}
		int count = 0;
		for (i = 0; i < flags.length; i++) {
			if (!flags[i]) {
				result[count++] = elements[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
}
