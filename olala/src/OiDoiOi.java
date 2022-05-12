import java.util.Scanner;

public class OiDoiOi {
	public static void main(String[] args) {
		String v;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap cai gì đó:");
		v = sc.nextLine();
		System.out.println("độ dài của chuỗi: "+v.length());
		
		int s=v.length();
		for (int i = 0; i < s; i++) {
			
			System.out.println("vị trí thứ " +i+ " là: "+v.charAt(i));
		}
	}

}
