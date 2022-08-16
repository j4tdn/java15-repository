package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] number = { 1, 3, 4, 5, 32, 22 };

		System.out.println("remove : " + Arrays.toString(remove(number, 3)));
		System.out.println("add: " + Arrays.toString(add(number, 3, 88)));
		System.out.println("insert: " + Arrays.toString(insert(number, 3, 88)));

	}
	private static
	// pos: vị tri
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

	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		for (int i = 0; i < target.length; i++) {
			if (i < pos) {
				target[i] = source[i];
			} else if (i == pos) {
				target[pos] = newValue;
			} else {
				target[i] = source[i - 1];
			}

		}
//		for(int i = 0 ; i < pos ; i++) {
//				target[i] = source[i];
//		}
//		
//		target[pos] = newValue;
//		
//		for(int i = pos + 1; i < target.length; i++) {
//			target[pos] = source[i-1];
//		}
		return target;
	}

	private static int[] remove(int[] source, int pos) {
		int[] target = new int[source.length];

		for (int i = 0; i < pos; i++) {
			target[i] = source[i];
		}
		for (int i = pos; i < target.length - 1; i++) {
			target[i] = source[i + 1];
		}
//		for (int i = 0; i < target.length -1; i++) {
//			if (i<pos) {
//				target[i]=source[i];
//			}
//			if (i>= pos) {
//				target[i]= source[i + 1];
//			}
//		}
//		
		return Arrays.copyOfRange(target, 0, target.length - 1);
	}
}
