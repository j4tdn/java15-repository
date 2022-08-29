package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06Different {
	private static int COUNT = 50000;

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();
		List<String> llist = new LinkedList<>();

		// Add
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.add("element # " + i);
		}
		System.out.println("Add " + COUNT + " elements: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.add("element # " + i);
		}
		System.out.println("Add " + COUNT + " elements: LikedList took " + (System.currentTimeMillis() - start) + "ms");

		// Add at index: 0(LA) 1000(LA) 25000 40000(AL#)
		for (int i = 0; i < COUNT; i++) {
			alist.add(25000, "element # " + i);
		}
		System.out.println("Add at index 25000: " + COUNT + " elements: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.add(25000, "element # " + i);
		}
		System.out.println("Add at index 25000: " + COUNT + " elements: LinkedList took "
				+ (System.currentTimeMillis() - start) + "ms");

		// Get
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.get(i);
		}
		System.out.println("Get element: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.get(i);
		}
		System.out.println("Get element: LinkedList took " + (System.currentTimeMillis() - start) + "ms");

		// Update
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.set(i, "modified element # " + i);
		}
		System.out.println("Update element: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.set(i, "modified element # " + i);
		}
		System.out.println("Update element: LinkedList took " + (System.currentTimeMillis() - start) + "ms");

		// Remove (LA)
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.remove(49000);
		}
		System.out.println("Remove element: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.remove(49000);
		}
		System.out.println("Remove element: LinkedList took " + (System.currentTimeMillis() - start) + "ms");
	}

}
