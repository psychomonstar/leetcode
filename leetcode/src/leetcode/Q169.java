package leetcode;

/**
 * Majority Element 
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */
import java.util.Arrays;

public class Q169 {
	public static void main(String[] args) {
		new Q169().majorityElement(new int[] { 2, 2, 3, 2, 4, 2, 3 });
	}

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		System.out.println(nums[nums.length / 2]);
		return nums[nums.length / 2];
	}
}
