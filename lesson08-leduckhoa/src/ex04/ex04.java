package ex04;
/*Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
số nguyên tố.
Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là
3 và 5.
Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
số này có là nguyên tố tương đương với nhau hay không?
Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.


=> phân tích ra thừa số nguyên tố rồi so sánh
 * */

public class ex04 {
	public static void main(String[] args) {
		if(Analysis(75,15)==true) System.out.println("YES");
		else System.out.println("NO");
		//Analysis(75, 15); true
		//Analysis(12, 18); true
		//Analysis(12, 19); false
	}
	

	private static boolean Analysis(long a, long b) {
		int n = (int) ((a>b) ? Math.sqrt(a) : Math.sqrt(b));
		
		long temp = ((a>b) ? a :b);
		long temp1= ((a>b) ? b :a);
		
		long[] arr = new long[n];
		int c = 0;
		long d = temp;
		//phân tích thừa số nguyên tố cho số lớn hơn
		for(long i = 2; i <= temp;i++) {
			if(d%i==0) arr[c++]=i;
			while(d%i==0) {
				d/=i;
			}
		}
		//lấy số nhỏ hơn chia cho các thừa số phân tích được 
		for(int i = 0; i < c;i++) {
			if(temp1 % arr[i] != 0) return false;
		}
		return true;
	}
}
