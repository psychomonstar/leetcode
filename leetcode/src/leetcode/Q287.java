package leetcode;
/**
 * Find the Duplicate Number
 * 
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
 */
import java.util.TreeSet;

public class Q287 {
    public int findDuplicate(int[] nums) {
    	TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
        	if(!set.add(nums[i])){
        		return nums[i];
        	}
		}
        return 0;
    }
}
