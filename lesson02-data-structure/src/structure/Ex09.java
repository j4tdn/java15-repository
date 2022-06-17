package structure;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hoán vị 2 phần tử
		Integer a =new Integer(12);
		Integer b = new Integer(36);
		System.out.println("a b: "+ a + b);
		
		System.out.println("<===swap===>: ");
	swap(a,b);
	System.out.println("a b: "+ a + b);
	
	
	}
		// static để làm gì
		private static void swap( Integer a, Integer b) {
			
			int temp = a;
			a = b;
			b = temp;
			System.out.println("a b: "+ a + b);
		}
		 // trên integer dưới integer ko hoán vị vì :
	

}
