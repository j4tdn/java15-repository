package lession02;
// hoán vị 2 phần tử 

public class Ex07 {

	public static void main(String[] args) {
		int a = 5 ;
		int b=7;
		int temp ;
		
		temp=a ;	 // temp = 5
		a=b; 		// a=7
		b=temp;		//a=7, b=5
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}

}
