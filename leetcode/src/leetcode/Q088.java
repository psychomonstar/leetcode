package leetcode;

/**Merge Sorted Array
 * 
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */

import java.util.Arrays;

public class Q088 {
	public static void main(String[] args) {
		new Q088().merge(new int[] { 0, 2, 3, 4, 0, 0, 0 }, 4, new int[] { 1, 2 }, 2);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] arr = new int[m + n];
		for (int i = 0; i < arr.length; i++) {
			if (i < m) {
				arr[i] = nums1[i];
			} else {
				arr[i] = nums2[i - m];
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			nums1[i] = arr[i];
		}
	}
}
