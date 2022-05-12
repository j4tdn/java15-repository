package view;
import java.util.Random;

public class Ex07_Random {
	public static void main(String[] args) {
		System.out.println("========RANDOM 5 SO TU NHIEN KHONG TRUNG NHAU========");
		System.out.println();
		int[] arr1 = Random();
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	}
	private static int[] Random() {
		Random rd = new Random();
		int count = 0;
		int count1 = 0;
		int arr[] = new int[5];
		while (true) {
			int a = rd.nextInt(20, 31);
			for (int i = 0; i < count1; i++) {
				if (a == arr[i]) {
					count++;	// nếu số random bị trùng thì tăng count;
					break;
				}
			}
			if (count == 0) { 
				arr[count1] = a; //neu khong trùng thì gan so vao mang va tang bien dem;
				count1++;
			}
			if(count1 == 5) {
				break; //dem du 5 so thi dung
			}
			count = 0;
		}
		return arr;
	}
}

