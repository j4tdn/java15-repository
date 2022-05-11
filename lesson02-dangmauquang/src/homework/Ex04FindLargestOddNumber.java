package homework;
/**
 * Chưa biết cách thêm các số lẻ vào 1 mảng khác
 */
public class Ex04FindLargestOddNumber {
	public static void main(String[] args) {
		int [] numbers = {5, 1, 9, 11, 20, 19, 17, 21, 30};
		System.out.println("Các số lẻ trong mảng là: " );
		for(int i: numbers) {
			if(i%2 != 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println("\n==========================");
		int max = 0;
		for(int n: numbers) {
			if(max < n) {
				max = n;
			}
		}
		
		System.out.println("Số lớn nhất trong mảng là: " + max);
	}
	

}
