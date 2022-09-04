package view;

import java.util.Scanner;

public class Ex01TriangleSymmetry {
	public static void main(String[] args) {
		int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        int x, output;
        for(int i = n;i>= 1; i--){
            for(int j = 0; j<= 2*n; j++){
                x = j-n;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;
 
                if(output > 0){
                    System.out.printf("%3d", output);
                } else{
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
	}
}
