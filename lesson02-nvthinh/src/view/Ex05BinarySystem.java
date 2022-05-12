package view;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Ex05BinarySystem {

	public static void main(String[] args) {
		System.out.println("Nhap so nguyen duong can doi sang he nhi phan");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println("he nhi phan la" +  Binary(n));
		Binary(n);
	}
	private static int Binary(int n){
	        int binary[] = new int[40];
	        int index = 0;
	        while(n > 0){
	            binary[index++] = n%2;
	            n = n/2;
	        }
	        for(int i = index-1;i >= 0;i--){
	            System.out.print(binary[i]);
	        }
	        return 0;
	    }

}
