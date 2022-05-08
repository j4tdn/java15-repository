

//package lession02;
import bean.CustomInteger;
public class Ex09 {

	public static void main(String[] args) {
		
				//Integer a = 5 ;
		 		CustomInteger a = new CustomInteger(5);
				CustomInteger b = new CustomInteger(7);
				//Integer b=7;
				
				System.out.println("a: " + a);
				System.out.println("b: " + b);	
				
				Swap(a,b);
				System.out.println("Sau khi hoan doi ==============================");
				
			
				// hoán đổi chưa thành công --> dùng đối tượng
				System.out.println("a: " + a);
				System.out.println("b: " + b);
			
	}
	private static void Swap (CustomInteger x, CustomInteger y)
	{
		int temp = x.value;
		x.value = y.value;
		y.value = temp; 
//		CustomInteger temp=x ;	 
//		x=y; 		
//		y=temp;	
	}

}


	