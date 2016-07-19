package leetcode;
/**
 * Search for a Range
 * Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
public class Q034 {
    public int[] searchRange(int[] nums, int target) {
    	int[] res = {-1,-1};
    	boolean isStart = false;
    	int count = 0;
        for (int i = 0; i < nums.length; i++) {
        	if(nums[i]==target){
        		if(!isStart){
        			res[0] = i;
        		}
        		isStart = true;
        		count++;
        	}	
		}
        if(isStart){
        	res[1] = res[0] + count - 1;
        }
        return res;
    }
}
