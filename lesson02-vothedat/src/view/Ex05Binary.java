package view;

import java.util.Scanner;

public class Ex05Binary {
	public static void main(String[] args) {
          Scanner ip = new Scanner(System.in);
          System.out.println("Nhap so: ");
          int n = Integer.parseInt(ip.nextLine());
          int[] Number = new int[10000];
          int i = 0, count = 0;
          while(n>0) {
        	  Number[i] = n % 2;
        	  i++;
        	  count ++;
        	  n = n / 2;
          }
          for(i = count - 1; i >=0; i--) {
        	  System.out.print("" + Number[i]);
          }
	}
}
