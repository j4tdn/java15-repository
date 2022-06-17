package view;

public class Ex02Sort {

	public static void SortArray(int arr[]) {
		int x = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 7 != 0 && arr[i] % 5 != 0) || (arr[i] % 7 == 0 && arr[i] % 5 == 0)) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 != 0 && arr[i] % 5 == 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int arr1[] = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		SortArray(arr1);
		for (int a : arr1) {
			System.out.print(a + " ");
		}

	}
}
