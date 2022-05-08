package lession02;

public class Ex08 {

	public static void main(String[] args) {
		
				//Integer a = 5 ;
				Integer a = new Integer(5);
				Integer b = new Integer(7);
				//Integer b=7;
				
				System.out.println("a: " + a);
				System.out.println("b: " + b);	
				
				Swap(a,b);
				System.out.println("Sau khi hoan doi ==============================");
				
			
				// hoán đổi chưa thành công --> dùng đối tượng
				System.out.println("a: " + a);
				System.out.println("b: " + b);
			
	}
	private static void Swap (Integer x, Integer y)
	{
		Integer temp=x ;	 
		x=y; 		
		y=temp;	
	}

}


	