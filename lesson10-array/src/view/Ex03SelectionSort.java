package view;

import java.util.Arrays;
/*
 * ideas của phương pháp sắp xếp chọn trực tiếp:
 * đưa phần tử nhỏ nhất về vị trí đầu của mảng
 * bằng cách cho i chạy từ 0 đến n-2
 * 	1 biến vt=i
 * 	j từ i+1 đến n-1 nếu a[j] < a[vt] thì gán vt cho j
 * đổi chỗ a[i] với a[vt] có nghĩa là biến vt sẽ lưu lại vị trí của phần tử nhỏ nhất
 * sau mỗi vòng lặp i thì sẽ đổi chỗ phần tử thứ i với phần tử nhỏ nhất vừa tìm được
 * ví dụ:
 * [1, 5, 11, 9, 4, 6]
   [1, 4, 11, 9, 5, 6]
   [1, 4, 5, 9, 11, 6]
   [1, 4, 5, 6, 11, 9]
   [1, 4, 5, 6, 9, 11]
   [1, 4, 5, 6, 9, 11]
  
 */
public class Ex03SelectionSort {
	public static void main(String[] args) {
		int[] a = {1,5,11,9,4,6};
		ss(a);
		System.out.println(Arrays.toString(a));
	}
	
	private static void ss(int[] a) {
		for(int i = 0;i<a.length-1;i++) {
			int vt = i;
			for(int j = i+1;j<a.length;j++) {
				if(a[j]<a[vt]) vt=j;
			}
			int temp = a[i];
			a[i] = a[vt];
			a[vt] = temp;
			System.out.println(Arrays.toString(a));
		}
	}
}
