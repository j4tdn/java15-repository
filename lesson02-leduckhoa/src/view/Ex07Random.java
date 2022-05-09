package view;

import java.util.Arrays;
import java.util.Random;

public class Ex07Random {
	public static void main(String[] args) {
		Ran();
	}
	private static void Ran() {
		Random rand = new Random();
		int[] a = new int[5];
		for(int i = 0; i < a.length; i++) {
			while(true) { // VÒNG LẶP VÔ HẠN ĐỂ GÁN NHIỀU GIÁ TRỊ RANDOM CHO X.
				int x = 20 + rand.nextInt(30 - 20 + 1);
				int sum = 0; // Biến sum dùng để đánh dấu
				for(int j = 0; j < i; j++) { //KIỂM TRA X ĐÃ CÓ TRONG MẢNG HAY CHƯA
					if(x == a[j]) { // NẾU CÓ THÌ BỎ QUA GIÁ TRỊ X 
						sum = 1;
						break;
					}
				}
				if( sum == 0 ) { //NẾU CHƯA THÌ GÁN x CHO a[i] VÀ THOÁT VÒNG LẶP
					a[i] = x ; break;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
}
