package view;

import java.util.Scanner;

public class Ex01RectanglesReverse {
	public static void main(String[] args) {
           Scanner ip = new Scanner(System.in);
           int m = ip.nextInt(), i, j, k;
           int n = m / 2 + 1;
           int z = 2 * n - 1;
           for(i = 1; i <= n - 1; i++) {
        	   for(j = 1; j <= i; j++) {
        		   System.out.print(j);
        	   }
        	   int kt = 2*(n - i) - 1;
        	   for(k = 1; k <= kt; k++) System.out.print(" ");
        	   for(int t = z - i + 1; t <= z; t++) System.out.print(t);
        	   System.out.print("\n");
           }
           for(int a = 1; a <= z; a++)
        	   System.out.print(a);
           System.out.print("\n");
           for(i=n-1;i>=1;i--){
               for(j = 1;j<=i;j++)
                   System.out.print(j);
               int kt = 2*(n-i)-1;
               for(k=1;k<=kt;k++)
                   System.out.print(" ");
               for(int t=z-i+1;t<=z;t++)
                   System.out.print(t);
               System.out.print("\n");
           }
	}
}
