package leetcode;
/**
 * Implement Queue using Stacks
 * Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
 */
import java.util.LinkedList;

public class Q232 {
	LinkedList<Integer> list = new LinkedList<>();
    // Push element x to the back of queue.
    public void push(int x) {
        list.addLast(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        list.remove(list.getFirst());
    }

    // Get the front element.
    public int peek() {
        return list.getFirst();
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	return list.isEmpty();
    }
}
