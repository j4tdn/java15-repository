package exam;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int n;
		System.out.println("Moi nhap n:"); n = ip.nextInt();
		int[] a = new int[n+3];
		int[] b = new int[n+3]; 
		for(int i = 0;i<=n+2;i++) {
			a[i] = 1; b[i] = 1;
		}
		
		
		
		int k = 0;
		while(k<=n){
		
		for(int i = 1; i<=k+2;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n");
		
		for(int i = 2; i<=k+2;i++) {
			b[i] = a[i-1] + a[i];
		}
		for(int i = 2; i<=k+2;i++) {
			a[i] = b[i];
		}
		k++;
		}
		
		
	}
}
