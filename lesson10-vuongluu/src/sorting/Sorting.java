package sorting;

import java.util.Arrays;
import java.util.Random;

import utils.SortUtils;

public class Sorting {
	public static void main(String[] args) {
		Integer[] numbers = new Integer[10];
		for(int i=0;i<numbers.length;i++) {
			Random random = new Random();
			numbers[i]=random.nextInt(100);
		}
		System.out.println(Arrays.toString(numbers));
	bubbleSort(numbers);
	System.out.println(Arrays.toString(numbers));
	selectionSort(numbers);
	System.out.println(Arrays.toString(numbers));
	insertionSort(numbers);
	System.out.println(Arrays.toString(numbers));
	shellSort(numbers);
	System.out.println(Arrays.toString(numbers));
	mergeSort(numbers,numbers.length);
	System.out.println(Arrays.toString(numbers));
	quickSort(numbers, 0, numbers.length-1);
	System.out.println(Arrays.toString(numbers));
	}

	private static void bubbleSort(Integer[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					SortUtils.swap(numbers, j, j + 1);
				}
			}
		}
	}

	private static void selectionSort(Integer[] numbers) {

		for (int i = numbers.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (numbers[j] > numbers[i]) {
					SortUtils.swap(numbers, j, i);
				}
			}
		}
	}

	private static void insertionSort(Integer[] numbers) {

		for (int i = 1; i < numbers.length; i++) {
			for (int j = 0; j < i; j++) {
				if (numbers[i] < numbers[j]) {
					SortUtils.swap(numbers, i, j);
				}
			}
		}
	}

	private static void shellSort(Integer[] numbers) {
		int n = numbers.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i++) {
				int key = numbers[i];
				int j = i;
				while (j >= gap && numbers[j - gap] > key) {
					numbers[j] = numbers[j - gap];
					j -= gap;
				}
				numbers[j] = key;
			}
		}
	}

	private static void mergeSort(Integer[] numbers, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		Integer[] l = new Integer[mid];
		Integer[] r = new Integer[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = numbers[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = numbers[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(numbers, l, r, mid, n - mid);
	}

	private static void merge(Integer[] numbers, Integer[] l, Integer[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				numbers[k++] = l[i++];
			} else {
				numbers[k++] = r[j++];
			}
		}
		while (i < left) {
			numbers[k++] = l[i++];
		}
		while (j < right) {
			numbers[k++] = r[j++];
		}
	}

	private static void quickSort(Integer[] numbers, int begin, int end) {
		if (begin < end) {
			int partitionIndex = partition(numbers, begin, end);

			quickSort(numbers, begin, partitionIndex - 1);
			quickSort(numbers, partitionIndex + 1, end);
		}
	}

	private static int partition(Integer[] numbers, int begin, int end) {
		int pivot = numbers[end];
		int i = (begin - 1);

		for (int j = begin; j < end; j++) {
			if (numbers[j] <= pivot) {
				i++;

				int swapTemp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = swapTemp;
			}
		}

		int swapTemp = numbers[i + 1];
		numbers[i + 1] = numbers[end];
		numbers[end] = swapTemp;

		return i + 1;
	}
}
