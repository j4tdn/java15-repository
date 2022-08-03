package ex06;
/*
 * Bài 6: Cho dãy các số tự nhiên được viết ra thành một dãy vô hạn trên đường thẳng:
1234567891011121314 ........ (1). Hỏi số ở vị trí thứ 100 trong dãy trên là số nào ?
Bạn hãy làm bài này theo hai cách: Cách 1 dùng suy luận logic trong vòng 30s rồi nhớ
kết quả trong đầu và cách 2 viết chương trình để tính toán và so sánh hai kết quả với
nhau.
Tổng quát bài toán trên: Chương trình yêu cầu nhập số K từ bàn phím và in ra trên màn
hình kết quả là số nằm ở vị trì thứ K trong dãy (1) trên. Yêu cầu chương trình chạy càng
nhanh càng tốt.
 */
//==> tạo ra chuỗi lưu k chữ cái rồi truy xuất kí tự ở vị trí index thứ k-1
import java.util.Scanner;

public class Ex06 {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Mời nhập k:");
		int k = ip.nextInt();
		System.out.println("số ở vị trí " + k + " là " + Treament(k));
	}
	private static char Treament(int k) {
		int i=1;
		String s = "";
		while(true) {
			s+=Integer.toString(i);
			if(i==k) break;
			i++;
		}
		return s.charAt(k-1);
	}
		
}
