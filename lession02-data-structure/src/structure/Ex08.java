package structure;

public class Ex08 {
	private static void Swap(int m, int n) {
		int tmp = m;
		m = n;
		n = tmp;
		System.out.println(" m:" + m);
		System.out.println(" n:" + n);

	}

	public static void main(String[] args) {
		int a=12;
		int b=36;
		Swap(a, b);
		System.out.println(" a:" + a);
		System.out.println(" b:" + b);
		
	}

}
