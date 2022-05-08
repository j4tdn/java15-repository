package structure;

import bean.CustomInteger;

public class Ex10 {

	private static void Swap(CustomInteger m, CustomInteger n) {
		int tmp = m.value;

		m.value = n.value;
		n.value = tmp;

		System.out.println(" m: " + m);
		System.out.println(" n: " + n);

	}
// kieu nguyen thuy phai co gia tri ban dau k dc phep NULL 
//PASS BY VALUE
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		System.out.println(("BEFORE SWAP"));
		System.out.println(" a:" + a);
		System.out.println(" b:" + b);
		Swap(a, b);
		System.out.println(("AFTER SWAP"));
		System.out.println(" a:" + a);
		System.out.println(" b:" + b);

	}

}
