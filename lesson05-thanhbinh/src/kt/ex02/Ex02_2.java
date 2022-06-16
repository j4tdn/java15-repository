package kt.ex02;

/*
Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
 VD1: n = 6, Ak = [3, 2, 1, 6, 5]
 Phần tử cần tìm có giá trị: 4
 VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
 Phần tử cần tìm có giá trị: 8
 */

public class Ex02_2 {
    public static void main(String[] args) {
        //General: Random n-1 elements which is from [1-n]
        //finding missing elements
        int [] numbers = {3, 2, 1, 6, 5};
        System.out.println("Missing elements : " + findMissingNumber(numbers));
    }

    private static int findMissingNumber(int [] numbers){
       //step1: find max elements = element.length+1 ==> N = 6
        int N = numbers.length+1;

        //step2 : find sum of N elements = N*(N + 1)/2
        //find multiiply of elements from 1 to N
        int mulofElements = 1;
        for (int i=1; i<= N ; i++){
            mulofElements *=i;
        }
        //step3 : Sum - Sum(number[k])(19) = 2
        int mulOfMissingElements = 1;
        for (int number:numbers){
            mulOfMissingElements *= number;
        }
        return mulofElements / mulOfMissingElements;
    }
}
