package io.algorithm.solution.q160_intersection_of_two_linked_lists;

/**
 * @Author: jian.liu
 * @Description //相交链表
 * @Date: 2022/2/11 15:51
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode A = headA, B = headB;
        while(A != B){
            A = A!=null ? A.next:headB;
            B = B!=null ? B.next:headA;
        }
        return A;
    }

}
