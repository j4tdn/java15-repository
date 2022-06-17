package structure.array;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String[] studens = {"a","ph","pe","gs"};
		System.out.println(Arrays.toString(getStudents(studens)));

	}
	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int cout = 0;
		for (String element: elements) {
			if(element.startsWith("p")) {
				result[cout] = element;
				cout ++;
			}
		}
		return Arrays.copyOfRange(result, 0, cout);
	}

}
