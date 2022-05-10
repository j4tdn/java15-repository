package view;

public class Ex05Binary {
	public static void main(String[] args) {

		int Number = 6;

		System.out.print("Hệ nhị phân của " + Number + " là: ");
//		  System.out.print(Integer.toBinaryString(decimalNumber));
		convertBinary(Number);

	}

	public static void convertBinary(int num) {
		int binary[] = new int[40];
		int index = 0;
		
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}

	}
}
