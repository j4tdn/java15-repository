package Ex01;
/*
 * Bài 1: Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng
nhau VD: {7 8 8 8 6 2 5 1} Kết quả: 6
 */

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,3,1};
		
		int[] remove=delete(numbers);
		System.out.println(Arrays.toString(remove));
		
		compare(numbers);
		
		System.out.println(max3rd(numbers));
		
	}
	private static int max3rd(int[] numbers) {
		sortASC(numbers);
		int index=0;
		for(int i=numbers.length-1; i>=0;i--) {
			if(numbers[i]!=numbers[i-1]) {
				index++;
			}
			if(index==3) {
				return numbers[i];
			}
		}
		return numbers[numbers.length];
	}
	public static void sortASC(int [] arr) {
        int tmp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
    }
	private static void compare (int[] numbers) {
		int sumdau = 0,sumcuoi=0;
		for(int i=0;i<numbers.length/2;i++) {
			sumdau+=numbers[i];
		}
		for(int i=numbers.length/2;i<numbers.length;i++) {
			sumcuoi+=numbers[i];
		}
		if(sumdau==sumcuoi) {
			System.out.println("n/2 phan tu dau bang n/2 phan tu cuoi");
			return;
		}
		if (sumdau>sumcuoi) {
			System.out.println("n/2 phan tu dau lon hon n/2 phan tu cuoi");
			return;
		}
		System.out.println("n/2 phan tu dau nho hon n/2 phan tu cuoi");
		return;
	}
	private static int[] delete(int[] numbers) {
		int[] result = new int[numbers.length] ;
		int len = 0;
		int tmp;
		for(int i=0;i<numbers.length;i++) {
			tmp=0;
			for(int j=0;j<numbers.length;j++) {
				if(i!=j && numbers[i]==numbers[j]) {
					tmp++;
					break;
				}
			}
			if(tmp==0) {
				result[len]=numbers[i];
				len++;
			}
		}
		return Arrays.copyOfRange(result, 0, len);
	}
	

}