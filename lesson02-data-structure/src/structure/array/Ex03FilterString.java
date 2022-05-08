package structure.array;

import java.util.Arrays;

public interface Ex03FilterString {
	public static void main(String[] args) {
		String [] students = {"Peter Croud", "Kaka","Valdes","Patrick Veria"};
		System.out.println(Arrays.toString(getStudents(students)));
	}
	private static String [] getStudents(String[] elements) {
		String [] result = new String[elements.length];
		for(String element: elements) {
			int count =0;
			if(element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);

	}
}
