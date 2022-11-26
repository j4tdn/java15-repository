package view;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("11 ->" +convertDeciMaltoBinary(11));
		System.out.println("10 ->" +convertDeciMaltoBinary(10));
		System.out.println("13 ->" +convertDeciMaltoBinary(13));
	}
	
	private static String convertDeciMaltoBinary(int Decimal) {
		String binary = "" ;
		
		while (Decimal >0) {
			binary = Decimal % 2 + binary;
			Decimal /=2;
		}
		
		return binary;
	}
}
