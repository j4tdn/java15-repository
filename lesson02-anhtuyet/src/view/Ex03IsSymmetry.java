package view;

import java.util.Scanner;

public class Ex03IsSymmetry {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap vao mot so bat ki: ");
		
		int a , b=0, c;
		a = ip.nextInt();
		c=a;
		while(a != 0) {
	        int digit = a % 10;
	        b = b * 10 + digit;
	        a /= 10;
	      }
	    if(b == c){
	        System.out.println(b+ " la so doi xung!!");
	      }
	      else{
	        System.out.println(b+ " khong phai la so doi xung!!");
	      }
	}
}
