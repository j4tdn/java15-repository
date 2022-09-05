package ex01;

public class Ex01 {

	

		public static void main(String[] args) {
			for (int j = 1; j <= 5; j++) {

				for (int k = 1; k <= j; k++) { 

					System.out.print("*");

				}

				for (int k = 5; k >= j; k--) { 
					System.out.print("  ");
				}

				for (int k = 1; k <= j; k++) {

					System.out.print("*");

				}
				System.out.println();
			}

			for (int j = 1; j <= 4; j++) { 

				for (int k = 4; k >= j; k--) { 

					System.out.print("*");

				}

				for (int k = 0; k <= j; k++) { 
					System.out.print("  ");
				}

				for (int k = 4; k >= j; k--) {

					System.out.print("*");

				}

				System.out.println();
			}
		}

	}