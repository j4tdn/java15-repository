package Ex02;

public class Ex02 {

	public class App {
		public static void main(String[] args) {
			int A[] = { 3, 2, 1, 6, 5 };
		
			System.out.println("Missing number in array A is: " + getMissingNumber(A));
		}

	
		public static int getMissingNumber(int array[]) {
			for (int i = 1; i <= array.length; i++) {
				int count = 0;
				for (int j = 0; j < array.length; j++) {
					if (i == array[j])
						count++;
				}
				if (count == 0) {
					return i;
				}
			}
			return Integer.MAX_VALUE;
		}
	}
}

	

