package view;

import java.util.Scanner;

/**
 * 
 * 6: Cho dãy các số tự nhiên được viết ra thành một dãy vô hạn trên đường
 * thẳng: 1234567891011121314 ........ (1). Hỏi số ở vị trí thứ 100 trong dãy
 * trên là số nào ? Bạn hãy làm bài này theo hai cách: Cách 1 dùng suy luận
 * logic trong vòng 30s rồi nhớ kết quả trong đầu và cách 2 viết chương trình để
 * tính toán và so sánh hai kết quả với nhau. Tổng quát bài toán trên: Chương
 * trình yêu cầu nhập số K từ bàn phím và in ra trên màn hình kết quả là số nằm
 * ở vị trì thứ K trong dãy (1) trên. Yêu cầu chương trình chạy càng nhanh càng
 * tốt.
 *
 */
public class Ex06 {
	public static void main(String[] args) {
		int[] a = {123,324233,645643234,43523};	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vị trí bạn muốn tìm số trong chuỗi: ");
		int k = Integer.parseInt(sc.nextLine());
		System.out.println("Vị trí thứ " + k + " trong chuỗi là: " + PositionNumber(a, k));
	}
	private static char PositionNumber(int[] a, int k) {
		String s = "";
		for (int i : a) {
			s+=i;
		}
	
		return s.charAt(k-1);
		
	}
}
