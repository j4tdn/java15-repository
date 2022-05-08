package loop;

public class Ex04BreakContinue {
	public static void main(String[] args) {
		// break, continue
		for (int i = 1; i<=10; i++) {
			//break: dung toan bo vong lap ngay lap tuc
			if (i==4) {continue;}//Ket thuc som vong lap hien tai
			System.out.println(i);
		}
		
	}
}
