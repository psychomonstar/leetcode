package leetcode;

import java.util.LinkedList;
/**
 * Median of Two Sorted Arrays
 *There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */
public class Q004 {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int times = (m + n) / 2;
		int index1 = 0;
		int index2 = 0;
		LinkedList<Integer> list = new LinkedList<>();
		while (list.size() <= times) {
			if(index1>=m){
				list.add(nums2[index2]);
				index2++;
				continue;
			}else if(index2>=n){
				list.add(nums1[index1]);
				index1++;
			}
			if (nums1[index1] < nums2[index2]) {
				list.add(nums1[index1]);
				index1++;
			} else {
				list.add(nums2[index2]);
				index2++;
			}
		}
		return (m + n) % 2 == 0 ? (double) (list.getLast() + list.get(list.size() - 2)) / 2 : list.getLast();
	}
}
