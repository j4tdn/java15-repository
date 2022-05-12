package view;

public class Ex06Prime {
	public static void main(String[] args) {
		int i=0;
		int count=0;
		while(count==200) {
			if(isPrime(i)) 
			{ count+=1; }
			i++;
		}
		System.out.println("Số nguyên tố thứ 200 là: "+count);
	}
		
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		int Square = (int) Math.sqrt(n);
		for (int i = 2; i <= Square; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
