package exercise;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	System.out.print("Enter number:");
	int ip = new Scanner(System.in).nextInt();
	boolean result = check(ip);
	if(result ) {
		System.out.println(ip + " is a power of 2");
	}
	else {
		System.out.println(ip + " is not a power of 2");
	}
}
private static boolean check(int ip){
	
	boolean results= true ;
	float number = ip;
	if (number == 1|| number == 0 || number == 2) {
		results = false;
	}
	else {
		while(number > 1) {
			number /= 2; 
		 
		if (number == 1){
			results =true;
		}
		else {
			results= false;
		}	
	}
	}
	
	return results;
}
}
