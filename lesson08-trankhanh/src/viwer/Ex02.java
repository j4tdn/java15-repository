package viwer;

import java.util.Scanner;

public class Ex02 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		 System.out.println(" Nhap vao ho va ten: ");
		 message = sc.nextLine();
		 char[] charArray = message.toCharArray();
		    boolean foundSpace = true;
		    for(int i = 0; i < charArray.length; i++) {
		    	if(Character.isLetter(charArray[i])) {
		    		if(foundSpace) {
		    			charArray[i] = Character.toUpperCase(charArray[i]);
		    	          foundSpace = false;
		    		}
		    	}
		    	else {
		            foundSpace = true;
		    	}
		    }
		    message = String.valueOf(charArray);
		    System.out.println(message);
	
	}
	}

