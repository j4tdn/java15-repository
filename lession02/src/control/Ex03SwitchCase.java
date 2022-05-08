package control;

import java.util.Scanner;

public class Ex03SwitchCase {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
	    int number =  ip.nextInt();
    //    int number = 2;

        switch (number) {
            case 1:
                System.out.println("Đây là thang 1");
                break;
            case 2:
                System.out.println("Đây là thang 2");
                break;
            case 3:
                System.out.println("Đây là thang 3");
                break;
            case 4:
                System.out.println("Đây là thang 4");
                break;
            case 5:
                System.out.println("Đây là thang 5");
                break;
            case 6:

            default:
                System.out.println("Chạy vào khối default");
                break;
        }
    }

}
