package io.algorithm.solution.q21_merge_two_sorted_lists;

/**
 * @Author: jian.liu
 * @Description //合并两个有序链表
 * @Date: 2022/1/26 16:27
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null){
            return list2;
        }

        if(list2 == null){
            return list2;
        }

        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return  list2;
        }

    }
}
