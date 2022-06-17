package structure;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hoán vị 2 phần tử
		int a =5 , b =7;
		int temp = a;
		a = b;
		b = temp ;
		
	swap(a,b);
	
	
	}
		// static để làm gì
		private static void swap( int a, int b) {
			
			int temp = a;
			a = b;
			b = temp;
			
		}
		
	

}
