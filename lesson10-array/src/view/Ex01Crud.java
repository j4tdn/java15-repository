package view;

import java.lang.reflect.Array;
import java.util.Arrays;

//crud; create red update delete
public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		int[] addArray = add(numbers, 3, 99);
		System.out.println("AddedArray: " + Arrays.toString(addArray));
		int[] insertArray = insert(numbers, 1, 111);
		System.out.println("InsertedArray: " + Arrays.toString(insertArray));
		int[] removeArray=remove(numbers, 3);
		System.out.println("RemovedArray: " + Arrays.toString(removeArray));
	}

	// dịch phải: duyệt từ phải sang trái
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

//coppy
	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		for (int i = 0; i < pos; i++) {
			target[i] = source[i];
		}
		target[pos] = newValue;
		for (int i = pos + 1; i < target.length; i++) {
			target[i] = source[i - 1];

		}
		return target;
	}

	private static int[] remove(int[] source, int pos) {
		int[] target = new int[source.length];
		for (int i = 0; i < target.length; i++) {
			target[i] = source[i];

		}
		for(int i=pos; i<target.length-1; i++) {
			target[i]=target[i+1];
		}
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
}
