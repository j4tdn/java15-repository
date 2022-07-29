package view;

public class Ex03 {
	public static void main(String[] args) {
		
		 String input = "Welcome to JAVA10 class";
	        char[] temparray = input.toCharArray();
	        int left, right = 0;
	        right = temparray.length - 1;
	  
	        for (left = 0; left < right; left++, right--) {
	            char temp = temparray[left];
	            temparray[left] = temparray[right];
	            temparray[right] = temp;
	        }
	  
	        for (char c : temparray)
	            System.out.print(c);
	        System.out.println();
		 
	}
}
