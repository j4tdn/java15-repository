package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05AddRemoveRetain {
	public static void main(String[] args) {
		List<Integer> listA = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> listB = Arrays.asList(5, 6, 7, 8, 9);
		//Hợp
		List<Integer> addAllList = new ArrayList<Integer>(listA);
		addAllList.addAll(listB);
		System.out.println(addAllList);
		//Hiệu
		List<Integer> removeAllList = new ArrayList<Integer>(listA);
		removeAllList.removeAll(listB);
		System.out.println(removeAllList);
		//Giao
		List<Integer> retaiAllList  = new ArrayList<Integer>(listA);
		retaiAllList.retainAll(listB);
		System.out.println(retaiAllList);
	}
}
