package view;

import java.util.Scanner;

public class Ex03Symmetry {
public static void main(String[] args) {
	System.out.print("Enter input: ");
	int ip = new Scanner(System.in).nextInt();
	
   if(check( ip)) {
	   System.out.println(ip + " is a symmetric number");
   }
   else {
	   System.out.println(ip + " is not a symmetric number");
   }
   
}
private static boolean check(int ip) {
	int number = ip;
	boolean results = true;
	int count = 0;
	float counts;
	
	while(number>0) {
		count ++;
		number/=10;

	}
	int []elements = new int[count];
	
	for(int i = 0;i<count;i++) {
		elements[i]= ip % 10;
		ip /= 10;

 	}
	
	counts = count/2;
	if(count % 2 == 0) {
		
		for(int i = 0; i < counts; i++ ) {
			if(elements[i]==elements[count-i-1]) {
				results = true;
			}
			else {
				results= false;
			}
		}
	}
	else {
		for(int i = 0; i < count; i++ ) {
			if(elements[i]==elements[count-i-1]) {
				results = true;
			}
			else {
				results= false;
			}
		}
	}
	
	
	return results;
}
}
