package leetcode;
/**
 * Single Number III
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 */
import java.util.Arrays;
import java.util.LinkedList;

public class Q260 {
    public int[] singleNumber(int[] nums) {
    	LinkedList<Integer> list = new LinkedList<>();
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length-1; i++) {
    		if(nums[i]!=nums[i+1]){
    			list.add(nums[i]);
    		}else{
    			i++;
    		}
		}
    	if(nums[nums.length-1]!=nums[nums.length-2]){
    		list.add(nums[nums.length-1]);
    	}
    	int res[] = new int[list.size()];
    	for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
    	return res;
    }
}
