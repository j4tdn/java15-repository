package view;

public class Ex01Power {
		public static void main(String[] args) {
			int[] numbers = {0,1,2,3,4,5,6,7,8};
			for(int number : numbers) {
				System.out.println("==> " + isPowerOf2(number));
			}
			System.out.println("================================");
			System.out.println("==> " + isPower(2,8));
			System.out.println("==> " + isPower(2,7));
			System.out.println("==> " + isPower(8,2));
		}
		
		private static boolean isPowerOf2(int x) {
			double n = Math.log10(x*1.0)/Math.log10(2.0);
			return Math.ceil(n)== Math.floor(n);
			
		}
		
		private static boolean isPower(int a, int b) {
			double n = a>b ? Math.log10(a*1.0)/Math.log10(b*1.0): Math.log10(b*1.0)/Math.log10(a*1.0);
			return Math.ceil(n)== Math.floor(n);
			
		}
}
