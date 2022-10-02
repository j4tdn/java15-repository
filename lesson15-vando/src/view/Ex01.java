package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
	    int [] arr = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
	    int [] arr1 = {5, 7, 9, 10, 20, 9, 7, 7, 11};
	    
	    
	    System.out.println(getUnique(arr));
	    System.out.println(getMany(arr1));
	}
	public static Set<Integer> getUnique(int ... arr) {
	    Set<Integer> distinct = new HashSet<>();
	    Set<Integer> unique = new HashSet<>();
	    
	    System.out.print("Input: " + Arrays.toString(arr) + " -> ");
	    
	    for (int x : arr) {
	        if (distinct.add(x)) {
	            unique.add(x); 
	        } else {
	            unique.remove(x);
	        }
	    }
	    return unique;
	}
	
	public static Set<Integer> getMany(int ... arr) {
	    Set<Integer> distinct = new HashSet<>();
	    Set<Integer> unique = new HashSet<>();
	    
	    System.out.print("Input: " + Arrays.toString(arr) + " -> ");
	    
	    for (int x : arr) {
	        if (!distinct.add(x)) {
	            unique.add(x); 
	        } 
	    }
	    return unique;
	}
	
}
