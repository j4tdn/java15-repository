package io;

import java.util.Scanner;

public class Ex01Scaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name :");
        String name = sc.nextLine();

        System.out.print("Enter hobbies :");
        String hobbies = sc.nextLine();

        System.out.print("Enter Ages :");
//        int age = sc.nextInt();
        int ages = Integer.parseInt(sc.nextLine());

        System.out.println("===================");
        System.out.println("name:" + name);
        System.out.println("hobbies:" + hobbies);
        System.out.println("age:" + ages);
    }
}
