package ex04;

import java.util.Arrays;

public class UniqueNumber{
	public static void main(String[] args) {
		int[] digits = {3,19,21,0,15,17,21};
		int[] uniqueArray = getUniqueElements(digits);
printf(digits);
System.out.println("\n========");
sort(uniqueArray);
printf(uniqueArray);
	}
	

private static int[] getUniqueElements(int [] elements) {
	int[] result = new int[elements.length];
	boolean [] isDupFlags= new boolean[elements.length];
	for(int out=0; out< elements.length; out ++) {
		for(int in =0; in<elements.length; in ++) {
			if(!isDupFlags[out]) {
				if(out!=in && elements[out]==elements[in]) {
					isDupFlags[out]=true;
					isDupFlags[in]=true;
				}
			}
		}
	}
	int count =0;
	for(int i =0; i<elements.length; i++) {
		if(!isDupFlags[i]) {
			result[count] =elements[i];
					count ++;
		}
	}
	return Arrays.copyOfRange(result, 0, count);
}
private static void sort(int[] elements) {
	for(int out =elements.length -1; out >0; out --) {
		for(int in =0; in < out; in ++) {
			int tmp= elements[in];
			elements[in]=elements[out];
			elements[out]=tmp;
		}
	}
}
private static void printf(int[] elements) {
	for(int element:elements) {
		System.out.println(element+ "  ");
	}
}
}