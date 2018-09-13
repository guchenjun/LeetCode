class Solution {

	public ListNode swapPairs(ListNode head) {
		ListNode p = head;
		if (p == null || p.next == null)
			return p;
		ListNode pNextNext = head.next.next;
		ListNode swapHead = head.next; // swapHead 为新链表头结点
		swapHead.next = head; // 原链表头结点成为第二个结点
		ListNode swapNextNext = swapPairs(pNextNext); // 从第三个结点开始递归交换
		swapHead.next.next = swapNextNext; // 新链表头结点衔接2n+1(即3,5,7...)结点
		return swapHead;
	}

	//上面的简单逻辑版
	public ListNode swapPairs2(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode temp = head.next;
		head.next = swapPairs(temp.next);
		temp.next = head;
		return temp;
	}
}