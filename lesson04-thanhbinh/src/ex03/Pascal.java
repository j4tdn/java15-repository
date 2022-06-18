package ex03;

import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("height : ");
        int n = scanner.nextInt();
        int x, output;

        for(int i = 1;i<= n; i++){
            for(int j = 0; j<= 2*n; j++){
                x = j-n;
                if(x < 0){
                    x *= -1;
                }
                output = i - x;

                if(output > 0){
                    System.out.printf(" "+output);
                } else{
                    System.out.printf("");
                }
            }
            System.out.println();

        }
    }
}
