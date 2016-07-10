package leetcode;
/*
 * Missing Number
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.
 */

import java.util.Arrays;

public class Q268 {
    public int missingNumber(int[] nums) {
    	Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i){
				return i;
			}
		}
        return nums.length;
    }
}
