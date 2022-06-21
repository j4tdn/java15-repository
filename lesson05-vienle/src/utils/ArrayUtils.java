package utils;

public class ArrayUtils {
	private ArrayUtils() {

	}

public static void sort(int[] elements) {
	for(int select = elements.length - 1; select > 0 ; select --) {
		for(int run = 0; run < select; run++) {
			if(elements[run] > elements[select]) {
				int tmp = elements[run];
				elements[run] = elements[select];
				elements[select] = tmp;
			}
		}
	}
				
			
		
	}
	public static void printf(int[] elements) {
		for (int element: elements) {
			System.out.print(element + "  ");
		}
		System.out.println();
}

}
