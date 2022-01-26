package io.algorithm.solution.q19_removeNthFromEnd;

/**
 * @Author: jian.liu
 * @Description //删除链表的倒数第 N 个结点
 * @Date: 2022/1/26 15:46
 */
public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode pre = dummyHead;
        ListNode slow = head;
        ListNode fast = head;


        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        while(fast != null){
            pre = pre.next;
            slow = slow.next;
            fast = fast.next;
        }

        pre.next = slow.next;

        return dummyHead.next;
    }
}
