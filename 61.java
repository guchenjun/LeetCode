class Solution {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode p = head;
		int len = 1;
		// 下一位是否为空
		while (p.next != null) {
			p = p.next;
			len++;
		}
		// 首位相连成环
		p.next = head;
		k = k % len;
		// 找到旋转点处
		for (int i = 0; i < len - k; i++) {
			p = p.next;
		}
		// 头部指向旋转点，断开前面连接
		head = p.next;
		p.next = null;
		return head;
	}
}