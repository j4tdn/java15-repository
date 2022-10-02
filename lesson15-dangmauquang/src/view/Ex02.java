package view;

public class Ex02 {
	public static void main(String[] args) {
		String input = "aaaababbbddc";
		count(input);
	}

	
	static void count(String input) {
		int counter[] = new int[256];
		for (int i = 0; i < input.length(); i++) {
			counter[input.charAt(i)]++;
		}		
		
		int max = Integer.MIN_VALUE;

		char array[] = new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			array[i] = input.charAt(i);
			int flag = 0;
			for (int j = 0; j <= i; j++) {
				if (input.charAt(i) == array[j])
					flag++;
			}
			if (flag == 1) {
				System.out.println("Số lần xuất hiện của " + input.charAt(i) + " trong chuỗi:" 
						+ counter[input.charAt(i)]);
			}
			
			for(int k = 0; k < counter.length; k++) {
				if (max < counter[input.charAt(i)]) {
					max = counter[input.charAt(i)];
				}
			}
		}
		
		System.out.println("Số lần xuất hiện nhiều nhất là: " + max);

	}
}
