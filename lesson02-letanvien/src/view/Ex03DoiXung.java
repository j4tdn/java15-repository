package view;
import java.util.Scanner;

public class Ex03DoiXung {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra");
		int number = input.nextInt();
		
		boolean coPhaiSoDoiXungHayKhong = kiemTraSoDoiXung(number);
		
		if (coPhaiSoDoiXungHayKhong == true) {
			System.out.println(number + " la so doi xung");
		}
		else {
			System.out.println(number + " khong la so doi xung");
		}
	
	
	}
	
	public static boolean kiemTraSoDoiXung(int n) {
		int res = 0, temp = n;
        while(temp > 0) {
            res = res*10 + temp % 10;
            temp /= 10;
            System.out.println(temp);
        }
        if(res == n) {
            return true;
        }
        else {
            return false;
        }
	}
}
