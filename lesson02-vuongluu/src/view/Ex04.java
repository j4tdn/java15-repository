package view;

public class Ex04 {
	public static void main(String[] args) {
		int[] numbers = { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int oddMax = oddMax(numbers);
		System.out.println(oddMax);
	}

	private static int oddMax(int[] n) {
		int tmp=0;
		for (int i=0; i < n.length; i++) {
			if(n[i]%2 != 0 ) {
				if(n[i]>tmp) {
					tmp = n[i];
				}
				
			}
		}
		return tmp;
	}
}
