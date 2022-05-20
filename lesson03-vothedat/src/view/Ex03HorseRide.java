package view;

import java.util.Scanner;

public class Ex03HorseRide {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
        System.out.println("Enter m: ");
        int m = Integer.parseInt(ip.nextLine());
        System.out.println("Enter n: ");
        int n = Integer.parseInt(ip.nextLine());
        int Numbers[][] = new int[m][n];
        int count = 0;
        for(int i = 0; i < m; i++) {
        	for(int j = 0; j < n; j++) {
        		Numbers[i][j] = ip.nextInt();
        	}
        }
        for(int i = 0; i < m; i++) {
        	int min = Numbers[i][0];
        	int a = 0;
        	for(int j = 0; j < n; j++) {
        		if(min > Numbers[i][j]) {
        			min = Numbers[i][j];
        			a = j;
        		}
        	}
        	int max = Numbers[0][a];
        	for(int k = 0; k < m; k++) {
        		if(max < Numbers[k][a]) max = Numbers[k][a];
        	}
        	if(max == min) count++;
        }
        if(count == 0) System.out.println("NO");
        else System.out.println("YES");
	}
}
