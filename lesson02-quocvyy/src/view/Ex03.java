package baitap;
import java.lang.Math;

import java.util.Scanner;

public class Bai3 {
	
	public static void main(String[] args) {
		int number = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("Nhập Số N: ");
		number = n.nextInt();
		
			int count = 0;
			int temp  = number;
			while(temp != 0) {
				temp = temp /10;
				count ++;
			}
			
			System.out.println("number có  " +number +  "chữ số");
			count = count -1 ;
			temp = number ;
			int sodaonguoc = 0;
			while (temp != 0) {
				sodaonguoc = sodaonguoc + temp%10 *pow(10,count);
				temp = temp /10;
				count --;
				
			}
			if(sodaonguoc = number ) {
				System.out.println("so dao nguoc: "+ sodaonguoc);
			}else {
				System.out.println("ko phai la so dao nguoc : ");
				
			}
		}
	
}
