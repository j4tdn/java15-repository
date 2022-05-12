package view;

/*
 *  Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
 * Người tạo : hnhvy
 * Ngày tạo : 12/05/22
 * **/
//Input 
/*
* B1 tạo biến  -> in thông báo nhập n
 * B2 : Kiểm tra số nguyên tố -> chạy vòng lặp for lặp từ 2 -> (n-1) n chia hết thì không phải số nguyên tố và ngược lại
 * B3 : Đếm số nto thứ 200 thì dừng lại
 * **/
//	Output In ra số nguyên tố thứ 200 trong hệ thống số tự nhiên.
public class Ex06 {
	public static void main(String[] args) {
			int count = 0;
			int i=1;
			while (count < 200) {
				i++;
				if(isPrimeNumber(i)) {
					count++;
				}
			}
			System.out.println(i);
		}
	public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}