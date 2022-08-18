package Ex01;

import java.util.Arrays;
// BÀI NÀY CÓ VẤN ĐỀ CHỖ NÀO MÀ NÓ CHẠY KO ĐÚNG Ở HÀM NUMBER3 
// THẦY CHỈ GIÚP EM VỚI Ạ

public class Number3 {

	public static void main(String[] args) {
		int arr1[] = { 7, 2, 6, 7, 4, 9, 8, 7, 2, 3, 1, 6, 8 };

		Arrays.sort(arr1);

		int size1 = Remove(arr1, arr1.length);
		show_array(arr1, size1);
		Number3(arr1);
	}

	public static void Number3(int arr[]) {
		int number3 =  0;
		for (int i = 0; i <= arr.length; i++) {
			if(i == arr.length - 3) {
				number3 = arr[i];
			}
		
		}
		System.out.println(number3);
			
		

		
	}

	public static int Remove(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int end = 0;

		for (int i = 1; i < n; ++i) {
			if (arr[i] != arr[end]) {
				++end;
				arr[end] = arr[i];
			}
		}

		return end + 1;

	}

	
	public static void show_array(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.print("\n");

	}

}
