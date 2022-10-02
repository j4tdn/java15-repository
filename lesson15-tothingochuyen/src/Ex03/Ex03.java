package Ex03;

import java.util.Scanner;

/**
 * Kiểm tra một số có phải là số hạnh phúc không, biết rằng số hạnh phúc là số
nguyên dương và khi lặp lại công thức tổng bình phương các chữ số đơn vị bên trong nó
liên tục ta sẽ được kết quả bằng 1. Nếu khi tổng bình phương các số có kết quả bị trùng
lặp không tiến về 1 thì số đó không phải là số hạnh phúc
Ví dụ 01: 1, 7, 10, 13, 19, 23, 28 là các số hạnh phúc
Ví dụ 02: 4, 52 không phải là số hạnh phúc
 * */
public class Ex03{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter input:");
		int number = input.nextInt( );
		int result = number;
		while (result != 1 && result != 4){
			result = isHappyNumber(result);
		}
		if (result ==1){
			System.out.println ("It is a Happy Number");
		}else{
			System.out.println (" It is not a Happy Number");
		}
		
	}
	
	public static int isHappyNumber (int number){
		int temp = 0;
		int sum = 0;
		while(number > 0){
			temp = number % 10;
			sum =sum + temp*temp;
			number = number/10;
		}
		return sum;
	}
}

