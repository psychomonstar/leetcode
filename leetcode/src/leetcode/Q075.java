package leetcode;
/*
 * Sort Colors
 * Given an array with n objects colored red, white or blue,
 * sort them so that objects of the same color are adjacent, 
 * with the colors in the order red, white and blue.
	Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class Q075 {
    public void sortColors(int[] nums) {
        int sum0 = 0, sum1 = 0, sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			switch (nums[i]) {
			case 0:
				sum0++;
				break;
			case 1:
				sum1++;
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if(i<sum0){
				nums[i] = 0;
				continue;
			}else if(i>=sum0&&i<sum0+sum1){
				nums[i] = 1;
				continue;
			}
			nums[i] = 2;
		}
    }
}
