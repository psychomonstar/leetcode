package leetcode;

/**
 * Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
import java.util.Arrays;

public class Q136 {
    public int singleNumber(int[] nums) {
    	int res = 0;
    	Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
			if(i%2==0){
				res+=nums[i];
			}else{
				res-=nums[i];
			}
		}
        return res;
    }
}
