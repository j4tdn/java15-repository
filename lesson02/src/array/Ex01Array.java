package array;

import java.util.ArrayList;

public class Ex01Array {
    public static void main(String[] args) {
        // index : 0 1 2 3 4 5
        // value : 0 0 0 0 0 0
        int [] numbers = new int[6];
        System.out.println( numbers[3]);

        //forIndex: duyệt theo index,
        for (int i = 0; i < numbers.length; i++){
            System.out.println("value at index" + i + ":" + numbers[i]);
        }

        System.out.println("===================================");

        //forEach : duyêt theo value
        for (int element:numbers){
            System.out.println("number :" + element);
        }
    }


}
