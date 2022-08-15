package bai1.view;

import java.util.Arrays;

public class Ex01 {
	public static int[] removeDuplicateItemArray(int[] source) {
		int[] result = new int[source.length];
		int count =0;
		boolean[] checks = new boolean[source.length];
		for(int i = 0;i<checks.length;i++)
		{
			if(checks[i]) continue;
			for(int j = 0;j<checks.length;j++)
			{
				if ( i == j) continue;
				if(source[i] == source[j]) {
					checks[i] = true;
					checks[j] = true;
				}
			}
		}
		for(int i = 0;i<checks.length;i++)
		{
			if(!checks[i]) {
				result[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	public static void main(String[] args) {
		int[] source = {1,2,3,4,3,1};
		System.out.println(Arrays.toString(removeDuplicateItemArray(source)));

	}
}
