package io.algorithm.solution.q148_sort_list;

/**
 * @Author: jian.liu
 * @Description //排序链表
 * @Date: 2022/2/8 13:11
 */
public class Solution {

    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode fast = head.next,slow = head;
        while(fast != null&& fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(temp);

        ListNode h = new ListNode(0);
        ListNode res = h;

        while(left != null && right != null){
            if(left.val < right.val){
                h.next = left;
                left = left.next;
            }else{
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }


        h.next= left != null? left: right;
        return  res.next;
    }


}
