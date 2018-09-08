/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode first = dummy;
		ListNode second = dummy;
		//keep gap of n+1 between first and second
		for (int i = 0; i <= n; i++) {
			first = first.next;
		}
		//move 1 step until first reach null
		while (first != null) {
			first = first.next;
			second = second.next;
		}
		//connect next number
		second.next = second.next.next;
		return dummy.next;
	}
}