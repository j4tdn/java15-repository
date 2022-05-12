package main;

import java.util.Scanner;

public class Task17 {
public static void main(String[] args) {
	float saving;
	float bankRate =  0.08f;
	float compound;
	int year;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Nhập sô tiền gửi ngân hàng");
	saving = sc.nextFloat();
	System.out.println("Nhập số năm gửi ngân hàng");
	
	year = sc.nextInt();
	
	compound = (float) Math.pow((saving*(1+bankRate)), year);
	System.out.println("sô tiền nhận được sau " +year+ " năm " +compound);
	}

}
