package io;

import java.util.Random;

public class Ex06SwitchCase2 {
    public static void main(String[] args) {
        int month = new Random().nextInt(12);
        System.out.println("month :" + month);

//        switch (month){
//            case 1,3,5,7,8,10,12:
//                System.out.println(month + "31");
//                break;
//            case 4,6,9,11:
//                System.out.println(month + "30");
//                break;
//            case 2:
//                System.out.println(month + "28");
//                break;
//            default:
//                System.out.println("invalid");
//                return;
//        }

    }
}
