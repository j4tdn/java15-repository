package structure;

import bean.CustomInteger;

//Hoàn vị (swap) 2 phần tử số nguyên (int, Interger)
public class Ex10 {
	public static void main(String[] args) {
		CustomInteger a = new CustomInteger(12);
		CustomInteger b = new CustomInteger(36);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a,b);
		System.out.println("====AFTER SWAP===");
		
		
		//case 1 ==> Code in MAIN method ==> Hard code
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
		// CASE 3 ==> create a Method for reusable
	// int f = a^ 12
	// int s = b^ 36 ===> PASS BY VALUE
		private static void swap(CustomInteger f, CustomInteger s){
			int tmp = f.value;
			f.value = s.value;
			s.value = tmp;
		System.out.println("f: " + f);
		System.out.println("s: " + s);
		}
	}
