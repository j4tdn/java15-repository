package mutable;

public class Ex03 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		int count = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int b = 0, c = 0, d = 0, e = 0;
		int index = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i + 1) == s.charAt(i)) {
				count++;
			//	System.out.println(count);
			} else {
				if (count < min) {
					min = count;
					d = index;
					 System.out.println("d = " + d);
					e = i + 1;
					 System.out.println("e = " + e);

				}
				count = 0;
				index = i + 1;
			}
			if (count > max) {
				max = count;
				c = i + 2;
				 System.out.println("c = " + c);
				b = index;
				 System.out.println("b= " + b);
			}
		}
		System.out.println(max + 1);
		System.out.println(min + 1);
		System.out.println(s.substring(b, c));
		System.out.println(s.substring(d, e));
	}
}
