package array;

import java.util.Arrays;

/**
 * viết phương thức - tìm kiếm phần tử lẻ trong mảng
 */

public class ex02 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9};
        int [] oddnumber = sole(numbers);
        System.out.println(Arrays.toString(oddnumber));

    }

    // tạo ra hoàm cần xác định
    //1. KDL trả về
    //2. Tham số truyền vào
    //3. Access modifier

    public static int [] sole (int [] array) {
        int [] result = new int[array.length];
        int run =0;
        for (int element : array) {
            if (element %2 !=0){
                result[run] = element;
                 run ++;
            }
        }

        //loại bỏ phàn tử 0 bị thừa
        return Arrays.copyOfRange(result,0,run);

        //cách 1

//        int [] oddnumberfinal = new int[run];
//        for (int i= 0; i<run;i++){
//            oddnumberfinal[i] = result[i];
//        }
//        return oddnumberfinal;
    }
}
