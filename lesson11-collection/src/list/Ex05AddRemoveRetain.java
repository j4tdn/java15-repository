package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05AddRemoveRetain {
	public static void main(String[] args) {
		List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> listB = Arrays.asList(5, 6, 7, 8, 9);
		
		// Hợp
		List<Integer> addAllList = new ArrayList<>(listA);
		addAllList.addAll(listB);
		System.out.println("addAllList: " + addAllList);
		
		// Hiệu
		List<Integer> removeAllList = new ArrayList<>(listA);
		removeAllList.removeAll(listB);
		System.out.println("removeAllList: " + removeAllList);
		
		// Giao
		List<Integer> retailAllList = new ArrayList<>(listA);
		retailAllList.retainAll(listB);
		System.out.println("retailAllList: " + retailAllList);

	}
}
