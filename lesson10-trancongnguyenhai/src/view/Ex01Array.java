package view;

import java.util.Arrays;
import static java.util.Comparator.*;

public class Ex01Array {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 1 };
		System.out.println("Array: " + Arrays.toString(numbers));
		System.out.println("Array after remove duplicate: " + Arrays.toString(removeDuplicateElement(numbers)));
		compareTwoHalfArray(numbers);
		System.out.println("3rd largest number: " + find3rdLargestnumber(numbers));
		System.out.println("=============================");
		int[] numbers2 = { 7, 8, 8, 8, 6, 2, 5, 1 };
		System.out.println("Array: " + Arrays.toString(numbers2));
		System.out.println("Array after remove duplicate: " + Arrays.toString(removeDuplicateElement(numbers2)));
		compareTwoHalfArray(numbers2);
		System.out.println("3rd largest number: " + find3rdLargestnumber(numbers2));
	}

	private static int[] removeDuplicateElement(int[] source) {
		boolean[] resignFlags = new boolean[source.length];
		int[] result = new int[source.length];
		int running = 0;
		for (int i = 0; i < source.length; i++) {
			if (!resignFlags[i]) {
				for (int j = i + 1; j < source.length; j++) {
					if (!resignFlags[j] && source[i] == source[j]) {
						resignFlags[i] = true;
						resignFlags[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < resignFlags.length; i++) {
			if (!resignFlags[i]) {
				result[running++] = source[i];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static void compareTwoHalfArray(int[] source) {
		int[] halfFirst = Arrays.copyOfRange(source, 0, source.length / 2);
		int[] halfSecond = Arrays.copyOfRange(source, source.length / 2 + 1, source.length);
		if (calAverageArray(halfFirst) > calAverageArray(halfSecond)) {
			System.out.println("Compare average: HalfFirst > HalfSecond");
		} else {
			System.out.println("Compare average: HalfFirst < HalfSecond");
		}
	}

	private static float calAverageArray(int[] elements) {
		float sum = 0;
		for (int element : elements) {
			sum += element;
		}
		return sum / elements.length;
	}

	private static int find3rdLargestnumber(int[] elements) {
		int[] elementsDuplicate = collapseArrayBySameElement(elements);
		Arrays.sort(elementsDuplicate);
		return elementsDuplicate[elementsDuplicate.length - 3];
	}

	private static int[] collapseArrayBySameElement(int[] elements) {
		boolean[] resignFlags = new boolean[elements.length];
		int[] result = new int[elements.length];
		int running = 0;
		for (int i = 0; i < elements.length; i++) {
			if (!resignFlags[i]) {
				for (int j = i + 1; j < elements.length; j++) {
					if (!resignFlags[j] && elements[i] == elements[j]) {
						resignFlags[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < resignFlags.length; i++) {
			if (!resignFlags[i]) {
				result[running++] = elements[i];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

}
