import java.util.Scanner;

public class KhiepDen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap cl gì vào cũng đc");
		String vklk = sc.nextLine();
		System.out.println("do dai của cai gì đó mày vừa mới nhập: "+ vklk.length());
		int c = vklk.length();
		for (int i= 0; i < c; i++) {
			System.out.println("vị trí thứ " +i+ "của chữ mày nhập là: "+ vklk.charAt(i));
			
		}
		
		
		
	}
	OiDoiOi t = new OiDoiOi();
	

}
