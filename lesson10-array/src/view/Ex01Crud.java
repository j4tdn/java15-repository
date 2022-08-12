package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] num = { 1, 9, 5, 36, 12, 33 };
		int[] addedArray = insert(num, 4, 99);
		int[] removedArray = remove(num, 4);
		System.out.println("AddedArray: " + Arrays.toString(addedArray));
		System.out.println("RemoveArray: " + Arrays.toString(removedArray));
	}

	private static int[] Add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		target[pos] = newValue;
		for (int i = 0; i < target.length; i++) {
			if (i < pos) {
				target[i] = source[i];
			}
			if (i > pos) {
				target[i] = source[i - 1];
			}
		}
		return target;
	}

	private static int[] insert(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		for (int i = target.length - 1; i > pos; i--) {
			target[i] = target[i - 1];
		}
		target[pos] = newValue;
		return target;
	}

	private static int[] remove(int[] source, int pos) {
		int[] target = new int[source.length - 1];
		for (int i = 0; i < pos; i++) {
			target[i] = source[i];
		}
		for (int i = pos; i < target.length; i++) {
			target[i] = source[i + 1];
		}
		// shift
		int[] targetShift = new int[source.length];
		for (int i = 0; i < pos; i++) {
			targetShift[i] = source[i];
		}
		for (int i = pos; i < target.length - 1; i++) {
			targetShift[i] = targetShift[i + 1];
		}
		return target;

	}
//
//	private static int[] add(int[] elements, int pos, int newValue) {
//
//	}
//
//	private static int[] add(int[] elements, int pos, int newValue) {
//
//	}
}
