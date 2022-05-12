package view;

public class Ex02_Factorial {
	public static void main(String[] args) {
		System.out.println("=======TINH GIAI THUA=======");
		System.out.println();
		System.out.println("Tong cua 4! + 7! + 12! + 18! = " + Factorial());
	}
	private static long Factorial() {
		int count = 0;
		long total;
		long value = 0;
		while(true) {
			if(count == 4 || count == 7 || count == 12 || count == 18) {
				total = 1;
				for(int i = 2; i <= count; i++) {
					total = total *i;
				}
				value += total;
			}
			count++;
			if(count == 19)
			{
				break;
			}
		}
		return value;
	}
}
