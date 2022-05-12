package array;

import java.util.Arrays;

public class Arr {
	public static void main(String[] args) {
		
	
	String text = "mình yêu các bạn nhiêu lắm các bạn có biết ko hã các bạn yêu của tôi";
	
	String[] arr = text.split(" ");
	System.out.println("in ra đi các bạn ơi: "+ arr[arr.length-2]);
	System.out.println("đô dài" + arr.length);
	
	String[] arr1 = text.split("yêu");
	System.out.println("in ra: " +Arrays.toString(arr1));
	
	}
}
