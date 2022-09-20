package leet;



public class Problem04 {
	public static void main(String[] args) {
		int[] nums1 = {1,2}, nums2 = {3,4};//1 2 3 4 5 6
		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
		
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];
        int i=0,j=0,count = 0;;
        while(i<nums1.length || j<nums2.length) {
        	if(j == nums2.length ||(i<nums1.length && nums1[i] < nums2[j])) {
        		nums3[count++] = nums1[i++];
        	}
        	else nums3[count++] = nums2[j++];
        }
        double x = 0d;
        
        if(count%2==0) x=(nums3[count/2]+nums3[(count/2)-1])*1.0/2; 
        else x=nums3[(count-1)/2];
        return x;
}
}