//public package BMT2;
import java.util.Scanner;


public class BMT21 {

	public static void main(String[] args) {
		
		int a,b;
		System.out.println("nhap a: ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		System.out.println("nhap b: ");
		b = scanner.nextInt();
		
		if(a==0) {
			if(b==0) {
				System.out.println("vo so nghiem");
			}else {
				System.out.println("vo nghiem");
			}
		}
		else {
			if(b==0) {
				System.out.println("nghiem: "+b);
			} else {
				System.out.println("nghiem: "+-b/a);
			}
		}
	}
}

