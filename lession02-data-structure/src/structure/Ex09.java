package structure;

public class Ex09 {
	
	private static void Swap(Integer m, Integer n) {
		Integer tmp = m;
		m = n;
		n = tmp;
		System.out.println(" m:" + m);
		System.out.println(" n:" + n);

	}
//PASS BY VALUE
	public static void main(String[] args) {
		Integer a= new Integer(12);
		Integer b=new Integer(36);
		Swap(a, b);
		System.out.println(" a:" + a);
		System.out.println(" b:" + b);
		
	}

}
