package view;

import java.util.Arrays;
import java.util.Collections;

import javax.xml.transform.Source;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		System.out.println("AddedArray :" + Arrays.toString(add(numbers, 3, 99)));
		System.out.println("Remove Array :" + Arrays.toString(remove(numbers, 3)));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static int[] remove(int[] elements, int pos) {
		int[] target = new int[elements.length];
		for (int i = 0; i < target.length; i++) {
			// target[i] = elements[i];
			target[i] = elements[i];
		}
		for (int i = pos; i < target.length -1; i++) {
			target[i] = target[i + 1];
		}
		return Arrays.copyOfRange(target, 0, target.length - 1);
	}

	private static int[] add(int[] sources, int pos, int newValue) {
		int[] target = new int[sources.length + 1];
		for (int i = 0; i < sources.length; i++) {
			target[i] = sources[i];
		}

		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}
		target[pos] = newValue;
		return target;
	}

}
