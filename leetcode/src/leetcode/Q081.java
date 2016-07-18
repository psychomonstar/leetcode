package leetcode;
/**
 * Search in Rotated Sorted Array II
 * Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?

Write a function to determine if a given target is in the array.
 */
public class Q081 {
    public boolean search(int[] nums, int target) {
        if(target>nums[0]){
        	for (int i = 1; i < nums.length; i++) {
				if(nums[i]==target){
					return true;
				}else if(nums[i]>target){
					return false;
				}
			}
        }else if(target == nums[0]){
        	return true;
        }else{
        	for (int i = nums.length-1; i >0; i--) {
        		if(nums[i]==target){
					return true;
				}else if(nums[i]<target){
					return false;
				}
			}
        }
        return false;        
    }
}
