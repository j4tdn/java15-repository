package loop;

import java.util.Iterator;

public class Ex01For {
	public static void main(String[] args) {
		int n = 100;
//	for (int i = 1; i < n; i++) {
//		System.out.print(i + "\t");
//		if (i % 12 ==0) {
//			System.out.println();
//		}
		String[] elements = { "A", "B", "C", "D" };
		for (int j = 0; j < elements.length; j++) {
			System.out.println(elements[j]);
		}
		for (String element : elements) {
			System.out.println(element);
		}
	}
}
