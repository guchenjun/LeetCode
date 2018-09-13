class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = head;
        // k次一循环看每轮长度是否够，不够则返回
        for (int i = 0; i < k; i++) {
            if (p == null) {
                return head;
            }
            p = p.next;
        }
        p = head;
        // 找到当次循环头结点，预留下次循环头结点
        ListNode tmp = head;
        for (int i = 0; i < k - 1; i++) {
            tmp = tmp.next;
        }
        ListNode nextLoopHead = tmp.next;
        // 新建ListNode数组保存原顺序对象，再返回来倒序连接一次
        ListNode[] oneTurnLists = new ListNode[k];
        oneTurnLists[0] = head;
        for (int i = 1; i < k; i++) {
            oneTurnLists[i] = oneTurnLists[i - 1].next;
        }
        for (int i = k - 1; i > 0; i--) {
            oneTurnLists[i].next = oneTurnLists[i - 1];
        }
        // 本轮最后一个结点(原头结点)递归衔接后面排序的结果
        p.next = reverseKGroup(nextLoopHead, k);
        return tmp;
    }
}