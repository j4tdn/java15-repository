package structure;

import bean.CustomInteger;

public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		swap(a, b);
		System.out.println("a:" + a);//12
		System.out.println("b:" + b);//36
	}
	//case 3 ==> Create a METHOD for reusable with custom class
	//CustomInteger f = a 12
	//CustomeInteger s = b 36 ===> PASS By VALUE
	private static void swap(CustomInteger f, CustomInteger s) {
		int tmp = f.value;//tmp=12, fv=12
		f.value = s.values; fv=36, sv=36
		s.value = tmp;
		//f=36
		//s=12
		System.out.println("f:"+f);
		System.out.println("s:"+s);
	}
}
