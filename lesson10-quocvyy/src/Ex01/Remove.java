package Ex01;

import java.util.Arrays;
// 
//  	NHỜ THẦY XEM GIÚP BÀI NÀY EM SAI CHỖ NÀO Ạ
//
public class Remove {
	public static void main(String[] args) {
		int [] arr1= {1,5,3,1,3,3,7,8,9,2,4,5,2,4,5,6};
		 Arrays.sort(arr1);
		int [] arr = Remove(arr1);
		show_array(arr);

	}
	   public static int[]  Remove(int arr[] ) {
	    	int [] s = new int [arr.length];
	    	 

	          for (int i = 0; i < arr.length; ++i) {
	          
	              if (arr[i] != arr[i+1]) { 
	             
	          s[i] = arr[i];
	              }
	              if (arr[i] == arr[i+1]) {
	            	  s[i] = 0;
	              }
	             
	          }
	        
	          return s;

	    }
	    public static void show_array(int arr[]){  
	        for (int i=0; i<= arr.length; i++)  System.out.print(arr[i]+" "); 
	     System.out.print("\n");

	
	    }
	 
	 }
