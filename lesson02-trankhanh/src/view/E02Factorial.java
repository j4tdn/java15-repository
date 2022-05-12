package view;

public class E02Factorial {
	public static void main(String[] args) {
		long S;
		S = giaithua(4) + giaithua(7) + giaithua(12) + giaithua(18);
		System.out.println("S = 4! + 7! + 12! + 18!\t"+"->" + "Tong S =  "+S);

	}

	public static long giaithua(int number){
		long tmp = 1;
		for(int  i = 1; i<=number;i++) {
			tmp *= i;
		}
		return tmp;
	}
		
}
