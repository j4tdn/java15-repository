package control;

import bean.MinMaxType;

import java.util.Random;

public class Ex06FileMaxMin {
    public static void main(String[] args) {
        Random rd = new Random();


        int a = rd.nextInt(20);
        int b = rd.nextInt(20);
        int c = rd.nextInt(20);

        System.out.println(find(a, b, c));

        System.out.println(a + "," + b + "," + c);
        System.out.println(findMax(a, b, c));
        System.out.println("==========================");
        System.out.println(Min(a, b, c));
        System.out.println("==========================");
        System.out.println(findMin(a, b, c));

    }

    private static MinMaxType find(int number1, int number2, int number3) {
        int maxValue = findMax(number1, number2, number3);
        int minValue = Min(number1, number2, number3);
        return new MinMaxType(minValue, maxValue);
    }

    private static int findMax(int number1, int number2, int number3) {
        return findMax(findMax(number1, number2), number3);
    }

    private static int findMax(int so1, int so2) {
        return Math.max(so1,so2);
    }

    private static int Min(int first, int secound, int third) {
        int min1 = Math.min(first, secound);
        return Math.min(min1, third);
    }

    private static int findMin(int number1, int number2, int number3) {
        return findMin(findMin(number1, number2), number3);
    }

    private static int findMin(int so1, int so2) {
        return Math.min(so1, so2);
    }
}
