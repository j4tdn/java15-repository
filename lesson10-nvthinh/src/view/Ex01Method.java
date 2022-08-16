package view;

import java.util.Arrays;
import java.util.Iterator;

public class Ex01Method {
	public static void main(String[] args) {
		int[] number = { 1, 3, 3, 7, 4, 5, 6, 7, 5, 8 };
		int[] results = remove(number);
		for (int result : results) {
			System.out.println(result);
		}
		System.out.println("=======================================");
		average(number);
		System.out.println("=======================================");
		sortASC(number);
		System.out.println(results[results.length - 2]);
	}
	 public static void sortASC(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
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

	private static void average(int[] source) {
		int[] numbers = new int[source.length];
		for(int i = 0 ; i < source.length; i++) {
			numbers[i]=source[i];
		}
		float s1 = 0.0f;
		float s2 = 0.0f;
		for (int i = 0; i < source.length / 2; i++) {
			s1 += source[i];
		};
		s1 /= source.length / 2;
		for (int i = source.length / 2; i < source.length; i++) {
			s2 += source[i];
		}
		s2 /= source.length / 2;
		if(s1==s2) {
			System.out.println("GTTB của n/2 phần tử đầu tiên bằng GTTB n/2 phần tử cuối cùng");
		}
		if(s1>s2){
			System.out.println("GTTB của n/2 phần tử đầu tiên lớn hơn GTTB n/2 phần tử cuối cùng");
		}
		else {
			System.out.println("GTTB của n/2 phần tử đầu tiên bé hơn GTTB n/2 phần tử cuối cùng");
		}
	}

}
