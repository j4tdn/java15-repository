package view;

import java.util.Arrays;
import java.util.List;

public class Ex03getMaxValidNumber {
	 public static void main(String[] args) {
		 String str = "Uyk892nn1234uxo2";      
		 str = str.replaceAll("[^0-9]+", " ");
		 
		 List<String> arr = Arrays.asList(str.trim().split(" "));
		 int  max = Integer.parseInt(arr.get(0));
		
		 for(int i = 1; i < arr.size(); i++) {
			 if(max < Integer.parseInt(arr.get(i))) {
				 max = Integer.parseInt(arr.get(i));
			 }
		 }
		 	
		 System.out.println(max);

	 }
}