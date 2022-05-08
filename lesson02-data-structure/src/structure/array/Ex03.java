package structure.array;

import java.util.Arrays;

// Array.toString( ten mang) xuat ra mang
// Arrays.copyOfRange(result, 0, 2); coppy tu phan tu thu 0 den thu 2-1
public class Ex03 {
	public static void main(String[] args) {
		String[] students = {"Peter Croud", "Kaka", "Valdes", "Patrick Veira"};
		System.out.println(Arrays.toString(getStudents(students)));
	}
	
	private static String[] getStudents(String[] elements) {
		String[] result= new String[elements.length];
		int count = 0;
		for(String element: elements) {
			if(element.startsWith("P")) result[count++] = element;
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
