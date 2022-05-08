package loop;

public class Ex04BreakContinue {
public static void main(String[] args) {
	for (int i = 1; i < 10; i++) {
		if(i % 4==0) {
			continue;
		}
		System.out.println(i);
	}
}
}
