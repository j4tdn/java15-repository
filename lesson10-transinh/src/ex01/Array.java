package ex01;


public class Array {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,3,1};
		
		// So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
		int sum1=0;int average1=0;
		int sum2=0;int average2=0;
		for(int i =0;i<array.length/2;i++) {
			average1+=array[i];sum1+=1;
		}
		
		for(int i = array.length/2;i<array.length;i++) {
			average2+=array[i];sum2+=1;
		}
		if(average1/sum1<average2/sum2) {
			System.out.println("giá trị trung bình của n/2 phần tử đầu tiên lớn hơn n/2 phần tử cuối cùng");
		}else {
			System.out.println("giá trị trung bình của n/2 phần tử đầu tiên nhỏ n/2 phần tử cuối cùng");
		}
		
		//Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng nhau
		int first = 0;
		int second = 0;
		int third = 0;
		for(int i = 0; i < array.length;i++) {
			if(array[i] > first) {
				first = array[i];
			}
		}
		for(int i = 0; i < array.length;i++) {
				if(array[i] < first && array[i] > second) {
					second = array[i];
		}
	}
		for(int i = 0; i < array.length;i++) {
			if(array[i] < second && array[i] > third) {
				third = array[i];
			}
		}
		System.out.println("số lớn thứ 3 trong mảng: "+third);
	}
}
