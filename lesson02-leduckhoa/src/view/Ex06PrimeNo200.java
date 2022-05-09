package view;

public class Ex06PrimeNo200 {
	public static void main(String[] args) {
		Search(200);
	}
	
	private static void Search(int a) {
		
		int i=3,count=2,sum=0;
		for(;count < a;) {
			i+=2;
			for(int j = 2 ; j <= Math.sqrt(i); j++ ) {
				if(i%j == 0) {
					sum=1;break;
				}
			}
			if (sum!=1) count++;
			sum=0;
		}
		System.out.println("So nguyen to thu 200 la: " + i);
	}
}
