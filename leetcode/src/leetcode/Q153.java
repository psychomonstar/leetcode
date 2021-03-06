package leetcode;
/**
 * Find Minimum in Rotated Sorted Array
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
 *
 */
public class Q153 {
    public int findMin(int[] nums) {
    	
        for (int i = nums.length-1; i >0; i--) {
        	if(nums[i-1]>nums[i]){
        		return nums[i];
        	}
		}
        return nums[0] ;
    }
}
