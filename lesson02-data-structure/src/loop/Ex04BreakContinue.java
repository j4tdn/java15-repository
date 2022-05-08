package loop;

public class Ex04BreakContinue {
public static void main(String[] args) {
	//break, continue
	
	for(int i =0; i <= 10; i++) {
		if (i % 4 == 0) {
			// break; // dung vong lap lai ngay lap tuc
			continue; // ket thuc som vong lap hien tai
		}
		System.out.println(i);
	}
}
}
