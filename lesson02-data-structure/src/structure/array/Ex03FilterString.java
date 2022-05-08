package structure.array;

import java.util.Arrays;

public class Ex03FilterString {
	public static void main(String[] args) {
		String[] students = {"Peter Croud", "Kaka", "Valdes", "Patrick Veira", "peterson"};
		System.out.println(Arrays.toString(getStudent(students)));
	}
	
	private static String[] getStudent(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for(String element: elements) {
			if(element.startsWith("P") || element.startsWith("p")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
