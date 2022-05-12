package view;

import java.util.Random;

/*
* Viết chương trình random 5 số nguyên ngẫu nhiên từ 20 – 30.
Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
* Người tạo : hnhvy
* Ngày tạo : 12/5/22
* **/
//Input 
/*
* B1 random 5 số từ 20-30
* B2 : Kiểm tra số có trùng không 
* Cho qua 2 vòng lặp while in từng giá trị random ra và so sánh vs từng giá trị trc đó trong mảng
* **/
//	Output In ra 5 số ngẫu nhiên không được trùng nhau
public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] array =new int[5];
		int i = 0;
		int j = 0;
		while (i<5) {
			array[i] = 20+rd.nextInt(10);
			j=0;
			
			while(j<i) {
				if(array[j]==array[i])
					break ;
				j++;
			}
			
			if (j==i)
				i++;
		}
		
		for(j=0;j<5;j++) {
			System.out.println(array[j]+" ");
		}
		
	}
	
}