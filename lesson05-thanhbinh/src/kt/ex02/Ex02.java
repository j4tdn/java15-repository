package kt.ex02;

import kt.ex02.util.ArrayUtils;

/*
Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
 VD1: n = 6, Ak = [3, 2, 1, 6, 5]
 Phần tử cần tìm có giá trị: 4
 VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
 Phần tử cần tìm có giá trị: 8
 */
public class Ex02 {
    public static void main(String[] args) {
        //General: Random n-1 elements which is from [1-n]
        //finding missing elements
        int [] numbers = {3, 2, 1, 6, 5};
        System.out.println("Missing elements : " + findMissingNumber(numbers));
    }

    private static int findMissingNumber(int [] numbers){
        int found = 0;
        //step 1: sort array of number ascending, descending

        ArrayUtils.sort(numbers);

        //step 2 : iterate elements in array
        //if elements[i] != elemrnts[i -1] +1 ==> found = elements[i-1]+1
        for (int i = 1; i< numbers.length;i++){
            if (numbers[i] - numbers[i-1] != 1){
                found =  numbers[i-1] +1;
                break;
            }
        }
        return found;
    }
}
