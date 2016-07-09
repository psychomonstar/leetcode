package leetcode;
/*
 * Two Sum
 * Given an array of integers, return indices of the two numbers such that 
 * they add up to a specific target.

	You may assume that each input would have exactly one solution.

	Example:
	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 */
public class Q001 {
    public int[] twoSum(int[] nums, int target) {
        int[] out={};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            	if(nums[i]+nums[j]==target){
            		out = new int[]{i,j};
            	}
            }
        }
        return out;
    }
}
