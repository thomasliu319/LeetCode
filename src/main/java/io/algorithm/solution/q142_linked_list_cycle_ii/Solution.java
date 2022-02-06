package io.algorithm.solution.q142_linked_list_cycle_ii;

/**
 * @Author: jian.liu
 * @Description //环形链表 II
 * @Date: 2022/2/7 00:23
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head, slow = head;

        while(true){
            if(fast == null || fast.next == null) return null;

            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }

        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
