package operator;

public class Ex02 {
	public static void main(String[] args) {
		int count = 0;
		if (count > 0 && count++ > 1) {
			System.out.println("step 1: " + count++); //
		}
		if (count >= 1 || ++count > 2) {
			System.out.println("step 2: " + count); // 2 3
		}
		if (count <= 2 && ++count >= 4) {
			System.out.println("step 3: " + count--); //
		}
		System.out.println("step 4: " + count); // 0 3 3
	}
}
