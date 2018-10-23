/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    
    public ListNode deleteDuplicates2(ListNode head) {
        if (head == null) return null;
        ListNode currNode = head;
        ListNode nextNode = head.next;
        while(nextNode != null) {
            if(nextNode.val == currNode.val) {
                currNode.next = nextNode.next;//直接跳过后一个值相同的节点
            } else {//遇到值不相同的节点
                currNode = nextNode;
            }
            nextNode = currNode.next;
        }
        return head;
    }
}