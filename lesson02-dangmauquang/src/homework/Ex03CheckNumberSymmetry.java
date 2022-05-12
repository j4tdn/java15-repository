package homework;
/**
 * @author dangm
 * chưa cho 1 mảng ngẫu nhiên được
 */
public class Ex03CheckNumberSymmetry {
	public static void main(String[] args) {
		int[] a = new int[5];
		int n = 13331;
		for (int i = 0; i < a.length; i++) {
			int b = n % 10;
			n = n / 10;
			System.out.print(b + " ");
			a[i] = b;
		}
		boolean check = true;
		for (int index = 0; index < a.length; index++) {
			if (a[index] != a[a.length - 1 - index]) {
				System.out.println("\nĐây không phải là số đối xứng");
				check = false;
				break;
			}
		}
		if(check == true) {
			System.out.println("\nĐây là số đối xứng");
		}

	}
}
