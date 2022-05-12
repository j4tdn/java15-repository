package view;

import java.util.Scanner;

/*
 * Viết chương trình chuyển đổi một số tự nhiên ở hệ cơ số 10 thành số ở hệ
cơ số 2
 * Người tạo : hnhvy
 * Ngày tạo : 12/05/22
 * **/
//Input nhập vào 1 số tự nhiên
/*
* B1 tạo biến  -> in thông báo nhập n
* B2 tạo mảng chứa các giá trị
 * B2 : dùng vòng lặp while chia từng phần tử 
 * B3 : Dùng vòng for để lấy số từ cuối trở về đầu 
 * **/
//	Output In ra đối xứng không
public class Ex05 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Please enter the number of n :");
		 int n = input.nextInt();
		convertBinary(n);
	}

	public static void convertBinary(int n){
        int binary[] = new int[40];
        int index = 0;
        while(n > 0){
            binary[index++] = n%2;
            n = n/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}