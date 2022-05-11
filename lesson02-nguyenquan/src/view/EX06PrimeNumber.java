package view;

public class EX06PrimeNumber {
public static void main(String[] args) {
	int [] elements = new int [10000];
	for(int i= 0; i<10000;i++) {
		elements[i] = i;
	}
	System.out.println("200th prime number is :" + PrimeNumber(elements));
	
}
private static int PrimeNumber(int []input) {
	int results = 0;
	int count = 0;
	for(int i = 0; i<input.length;i++) {
		
		if(check(input[i])) {
			count++;
			if(count == 200) {
				results = input[i];
				break;
			}
		}
	}
	return results;
}
private static boolean check(int input) {
	boolean results = true;
	if(input < 2) {
		results = false;
	}
	else {
		int temp = (int) Math.sqrt(input);
		for(int i =2;i <= temp ; i++) {
			if(input % i== 0) {
				results = false;
				break;
			}
			else {
			results = true;
		}
	}
}
	return results;
}
}

