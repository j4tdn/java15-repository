package view;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Ex04Lamda {
	public static void main(String[] args) {
		// Supplier , Consumer , Function , BiFunction , Predicate , Comparator
		// Signature

		// Create an instance of functional interface
		Consumer<Integer> consumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		// using lamda - mot doi tuong kieu du lieu functional interface - annonyous
		// function
		// short version to create
		consumer = (t) -> {
			System.out.println(t);
		};
		Arrays.asList(1, 2, 3).forEach(consumer);
		// Ly thuyet : Tim hieu functional interface , lamda de ap dung trong
		// nhung function cua Java

	}

}
