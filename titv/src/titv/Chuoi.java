package titv;

import java.util.Arrays;

public class Chuoi {
	public static void main(String[] args) {
	String[] arr= new String[3];
	arr[0] = "goát súp";
	arr[1]= "hè hè hê";
	arr[2]="lên xe bro";
	String[] arr1 = arr;
	System.out.println(Arrays.toString(arr1));
	
	String[] arr2 = arr.clone();
	arr2[2] = "ối dồi ôi luôn á";
	System.out.println(Arrays.toString(arr2));
	
	System.arraycopy(arr1, 1, arr2, 0, 2);
	System.out.println(Arrays.toString(arr2));
	

	
		
		
		

	}
}
