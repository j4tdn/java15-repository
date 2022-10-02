package view;


import java.util.Arrays;
import java.util.Random;


public class Ex01 {
	public static void main(String[] args) {
		Random random = new Random();
		int  [] lists = new int[100]; 
		for(int i = 0 ;i< 100;i++) {
			lists[i]= random.nextInt(1, 21);
		}
		int[] results = listed(lists);
	
	}
	
	private static int[] listed(int[] source) {
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
}
