package leet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Problem01 {
	public static void main(String[] args) {
		int[] nums = {3,3};
		int[] list = twoSum(nums, 6);
		System.out.println(Arrays.toString(list));
		
	}
	private static int[] twoSum(int[] nums, int target) {
		List<Integer> n = new ArrayList<>();
	
		for(int i = 0; i< nums.length; i++) {
			n.add(nums[i]);
		}
		n.sort((o1,o2) -> o1 - o2 );
		
		int i,j;
		for(i = 0,j=nums.length-1; j>=0 && i<nums.length-1;) {
			if(n.get(i) + n.get(j) == target) break;
			else if(n.get(i) + n.get(j) < target) i++;
			else if(n.get(i) + n.get(j) > target) j--;
			
		}
		int[] twosum = new int[2];
		for(int k =0; k< nums.length;k++) {
			if(nums[k] == n.get(i)) {
				twosum[0] = k;break;
			}
		}
		for(int k =nums.length -1; k>0;k--) {
			if(nums[k] == n.get(j)) {
				twosum[1] = k;break;
			}
		}
		
		return twosum;
	}
}
