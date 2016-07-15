package leetcode;
/**Remove Duplicates from Sorted Array II
 * 
 * Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
 * 
 */
import java.util.LinkedList;

public class Q080 {
	public int removeDuplicates(int[] nums) {
		int count = 0;
		if (nums.length >=0 && nums.length<= 2) {
			return nums.length;
		}
		LinkedList<Integer> list = new LinkedList<>();
		list.add(nums[0]);
		for (int i = 1; i < nums.length ; i++) {
			if(nums[i] == nums[i-1]){
				list.add(nums[i]);
				count++;
			}else{
				list.add(nums[i]);
				count = 0;
			}
			if(count>1){
				list.removeLast();
			}
		}
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			nums[i] = list.get(i);
		}
		return list.size();
	}

	public static void main(String[] args) {
		new Q080().removeDuplicates(new int[] {1,1,1,2,2,2,3,4});
	}
}
