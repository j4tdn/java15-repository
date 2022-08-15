package view;

import java.util.Arrays;

import bean.Average;
import static utils.UtilsArrays.*;

public class Ex01HandlingMethod {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 2, 2, 3, 1 };

		int[] results = remove(numbers);
		for (int result : results) {
			System.out.println(result);
		}
		System.out.println("======================");
		int[] source = { 4, 5, 6, 1, 2, 3 };
		Average average = compare(source);
		if (average.getHalfHead() > average.getHalfLast()) {
			System.out.println("1 nua gia tri dau lon hon");
		} else if (average.getHalfHead() < average.getHalfLast()) {
			System.out.println("1 nua gia tri sau lon hon");

		} else {
			System.out.println(("2 nua bang nhau"));
		}
		System.out.println("=====================");
		int[] textArrays = { 7, 8, 8, 8, 6, 2, 5, 1 };
		int Maxthird = thirdLargest(textArrays);
		System.out.println("gia tri lon thu 3 la: " + Maxthird);

	}

	private static int[] remove(int[] source) {
		int[] numbers = new int[source.length];
		boolean[] resignedFlags = new boolean[source.length];
		int running = 0;
		for (int i = 0; i < source.length - 1; i++) {
			if (resignedFlags[i] == true) {
				continue;
			}
			for (int j = i + 1; j < source.length; j++) {
				if (source[i] == source[j]) {
					resignedFlags[i] = true;
					resignedFlags[j] = true;
				}
			}

		}
		for (int i = 0; i < source.length; i++) {
			if (resignedFlags[i] == false) {
				numbers[running++] = source[i];
			}
		}
		return Arrays.copyOfRange(numbers, 0, running);

	}

	private static Average compare(int[] source) {
		Average average = new Average();
		float halfHead = 0.0f;
		float halfLast = 0.0f;
		for (int i = 0; i < source.length / 2; i++) {
			halfHead += source[i];
		}
		halfHead /= source.length / 2;
		for (int i = source.length / 2; i < source.length; i++) {
			halfLast += source[i];
		}
		halfLast /= source.length / 2;
		average.setHalfHead(halfHead);
		average.setHalfLast(halfLast);
		return average;
	}

	private static int thirdLargest(int[] source) {
		int count = 0;
		int Maxthird =  Integer.MIN_VALUE; 
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (source[i] < source[i + 1]) {
					swap(source, i, i + 1);
				}
			}
		}
		for(int i = 1; i<source.length; i++) {
			if(source[i-1]!= source[i] ) {
				count++;
			}
			if(count == 2) {
				Maxthird = source[i];
			}
		}
		return Maxthird;
	}

}
