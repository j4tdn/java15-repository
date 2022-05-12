package main;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
        Random rd = new Random();
        int[] a = new int[10];
        for(int i=0; i < 5; i++) {
       	    while(true) {
       	    	int x = rd.nextInt(20,30);
       	    	int k = 0;
       	    	for(int j = 0; j < i; j++) {
       	    		if(x == a[j]) {
       	    			k = 1;
       	    			break;
       	    		}
       	    	}
       	    	if(k == 0) {
       	    		a[i] = x;
       	    		break;
       	    	}
       	    }
       	   System.out.println("" + a[i]);
        }
	}
}
