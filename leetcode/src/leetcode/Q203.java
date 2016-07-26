package leetcode;
/**
 * Remove Linked List Elements
 * Remove all elements from a linked list of integers that have value val.
 */
public class Q203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode front = new ListNode(0);
        front.next = head;
        ListNode temp = front;
        while(temp.next!=null){
        	if(temp.next.val == val){
        		temp.next = temp.next.next;
        	}else{
        		temp = temp.next;
        	}
        }
        return front.next;
    }
}
