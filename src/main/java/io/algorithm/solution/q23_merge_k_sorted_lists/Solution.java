package io.algorithm.solution.q23_merge_k_sorted_lists;

/**
 * @Author: jian.liu
 * @Description //合并 K 个排序链表 分而治之
 * @Date: 2022/2/1 12:17
 */
public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {

        if(lists == null ||lists.length == 0) return null;

        return merge(lists, 0, lists.length-1);
    }

    private ListNode merge(ListNode[] lists, int left, int right){
        if(left == right) return lists[left];

        int mid = left + (right-left)/2;
        ListNode l1 = merge(lists, left, mid);
        ListNode l2 = merge(lists, mid+1, right);
        return mergeTwoList(l1, l2);

    }

    private ListNode mergeTwoList(ListNode l1, ListNode l2){

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }

    }

}
