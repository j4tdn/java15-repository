package structure;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Viết chương trình tìm phần tử lẻ trong mảng
 **/

public class Ex03 {
    public static void main(String[] args) {
        int a [] = {2,4,6,7,5,12,21};

        int [] oddnumber = findoddnumber(a);
        System.out.println(Arrays.toString(oddnumber));
    }

    // tạo ra hàm. cần xác định
    //1. KDL trả về : int[]
    //2. Tham số truyền vào
    //3. Access modifier

    private static int[] findoddnumber(int [] element){
        int result [] = new int[element.length];
        int run = 0;
        for (int elements:element){
            if (elements % 2 !=0){
                result[run] = elements;
                run++;
            }
        }
        return result;
    }
}
