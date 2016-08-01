package leetcode;
/**
 * Remove Duplicates from Sorted List
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class Q083 {
    public ListNode deleteDuplicates(ListNode head) {
		if(head==null){
		    return null;
		}
		ListNode front = new ListNode(0);
		front.next = head;
		ListNode index = front.next;
		while(index.next!=null){
		    if(index.next.val == index.val){
		        index.next = index.next.next;
		    }else{
		        index = index.next;
		    }
		}
		return front.next;
    }
}
