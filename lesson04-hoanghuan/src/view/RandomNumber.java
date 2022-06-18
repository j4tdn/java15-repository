package view;

import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		int n;
	    Scanner sc = new Scanner(System.in);	         
	    do {
	        System.out.println("Nhap n: ");
	        n = sc.nextInt();
	    } while (n < 0);
	    int array[] = new int[n];       
	    for (int i = 0; i < n; i++) {
	        System.out.print("Nhap A["+ i +"]: ");
	        array[i] = sc.nextInt();
	    }
	    int a = 0; int b = n;
	    for (int i=1; i < n; i++) {
	    	if (array[i] % 7 == 0) {
	    		int tam1 = array[a];
	    		array[a] = array[i];
	    		array[i] = tam1;
	    		a++;
	    	}	 
	    }
	    for (int i=n; i >0; i--) {
	    	if (array[i] % 5 == 0) {
	    		int tam2 = array[b];
	    		array[b] = array[i];
	    		array[i] = tam2;
	    		b--;
	    	}	 
	    }
	}
}
