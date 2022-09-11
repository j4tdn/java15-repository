package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		
		System.out.println(Arrays.toString(add(numbers, 5, 99)));
		
		System.out.println("=================");
		System.out.println(Arrays.toString(insert(numbers, 4, 77)));
		System.out.println("======================");
		System.out.println(Arrays.toString(remove(numbers, 5)));
		System.out.println("==================");
		System.out.println(Arrays.toString(remove02(numbers, 5)));
	}
	
	private static int[] insert(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		for(int i = target.length- 1; i > pos; i--) {
			target[i] = target[i - 1];
		}
		target[pos] = newValue;
		return target;
	}
	
	//cach 1
	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int[source.length + 1];
		for (int i = 0; i < target.length; i++) {
			if(i < pos) {
				target[i] = source[i];
			}else if(i > pos) {
				target[i] = source[i-1];
			}else {
				target[i] = newValue;
			}
			
		}
		
		return target;
	}
	private static int[] remove(int[] source, int pos) {
		int[] target = new int[source.length - 1];
		
		for (int i = 0; i < target.length; i++) {
			if(i < pos) {
				target[i] = source[i];						
			}else {
				target[i] = source[i+1];
			}
		}
		
		return target;
	}
	private static int[] remove02(int[] source, int pos) {
		int[] target = new int[source.length];
		
		for (int i = 0; i < source.length; i++) {
			target[i]  = source[i];
			
		}
		for (int i = pos; i < target.length -1; i++) {
			target[i] = target[i+1];
		}
		return Arrays.copyOfRange(target, 0, target.length-1);
	}
}
