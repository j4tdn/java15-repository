package baitap;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		int n = 0;
		for(int i = 2;i<100000;i++) {
			for(int a = 2;i <= Math.sqrt(i); a++) {
				if(a%i==0) {
					n++;
					if(n == 200) {
						System.out.println("số nguyên tố thứ 200 là : "+200);
					}
				}
				
			}
			
		}
	}

}
