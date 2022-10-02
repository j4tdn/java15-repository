package view;

import java.util.Scanner;

public class Ex03 {

public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	  System.out.println("nhap so hanh phuc: ");
	  n = sc.nextInt();
	  isHappyNumber(n);
	  
	  
}
private static boolean isHappyNumber(int n) {
    int thuong, tong = 0, sodu = 0, count = 0;
    boolean result = true;


    int[] check = new int[730];
    for (int i = 1; i <= 729; i++) {
        check[i] = 0;
    }

    while (n != 1) {
    if (check[n] == 1){
        result = false;
        break;
    } 
    check[n]= 1;
    thuong = n;
    while(thuong>0){
        sodu = thuong%10;
        thuong=thuong/10;
        tong = tong + sodu*sodu;
    }
    n = tong;
    tong = 0;
    }

    return result;
}

}