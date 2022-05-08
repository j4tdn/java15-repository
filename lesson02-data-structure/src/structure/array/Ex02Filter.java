package structure.array;

import java.util.Arrays;

/**
 * 
 *1.Tìm những phần tử lẻ trong mảng số nguyên
 *    Input: Mảng
 *    Output: Mảng số lẻ
 */
public class Ex02Filter {
       public static void main(String[] args) {
		    int[] numbers = { 23, 25, 16, 33, 66};   
		    int[] oddNumbers = findOddNumbers(numbers);
		    System.out.println(Arrays.toString(oddNumbers));
	   }
       
       // int[] elements = numbers;
       private static int[] findOddNumbers(int[] elements) {
           // index: 0 1 2 3 4 
    	   // value: 23 25 33 0 0
    	    int[] OddElements = new int[elements.length];
    	    int count = 0;
    	    for (int element: elements) {
    	    	 if(element % 2 != 0) {
    	    		 OddElements[count] = element;
    	    		 count++;
    	    	 }
    	    }
    	    
    	    int[] result = new int[count];
    	    for(int i=0; i < count; i++) {
    	    	result[i] = OddElements[i];
    	    }
    	    
    	    return result;
       }
}
