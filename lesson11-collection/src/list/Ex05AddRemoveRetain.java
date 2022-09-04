package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05AddRemoveRetain {
	public static void main(String[] args) {
		List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> listB = Arrays.asList(5, 6, 7, 8, 9);

		List<Integer> addAllList = new ArrayList<>(listA);
		addAllList.addAll(listB);
		addAllList.forEach(v -> System.out.print(" " + v));
		System.out.println();
		List<Integer> removeAllList = new ArrayList<>(listA);
		removeAllList.removeAll(listB);
		removeAllList.forEach(v -> System.out.print(" " + v));
		System.out.println();
		// Giao
		List<Integer> retainAllList = new ArrayList<>(listA);
		retainAllList.retainAll(listB);
		retainAllList.forEach(v -> System.out.print(" " + v));
		System.out.println();

	}

}
