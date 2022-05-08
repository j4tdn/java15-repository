package structure.array;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class Ex03FilterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students = { "Quoc", "Phu", "Phuong", "Phuc", "anh nho em" };
		System.out.println(Arrays.toString(getStudents(students)));

	}

	private static String[] getStudents(String[] elements) {
		String[] result = new String[elements.length];
		int count = 0;
		for (String element : elements) {
			if (element.startsWith("P")) {
				result[count] = element;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
