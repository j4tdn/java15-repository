package structure.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex03FilterString {
	public static void main(String[] args) {
		String[] students = {"Peter cround", "Kaka", "Valdes", "Patrick Veira"};
		
		System.out.println(Arrays.toString(getStudents(students)));
	}
	public static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for (String element : elements) {
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
