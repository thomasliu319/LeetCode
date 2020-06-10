package io.algorithm.collection.ReverseList;

import com.alibaba.fastjson.JSON;

/**
 * @创建人 thomas_liu
 * @创建时间 2020/6/10 10:11
 * @描述 反转链表
 * 以下思路可以理解为：头插法
 * 1、新建一个用于存放反转结果集的链表
 * 2、遍历链表，也就是代码中的item
 * 3、拿到item中的第一个节点之后，由于为了循环能够正常继续，我们需要用一个next节点，用来保存第一个节点之后的节点元素
 * 4、再把result节点之后的next元素，赋值给item中的next节点
 * 5、再把item本身，赋值给result中的next，这样就完成一个头插法的操作
 * 6、最后next元素赋值给item，继续循环
 *
 */
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
public class ReverseList {
    // ===========================================================
    // Constants
    // ===========================================================


    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================


    // ===========================================================
    // Getter &amp; Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================


    // ===========================================================
    // Methods
    // ===========================================================

    public ListNode* reverseList(ListNode* head){
       //申请节点，pre和 cur，pre指向null
       ListNode* pre = NULL;
       ListNode* cur = head;
        ListNode* tmp = NULL;
       while(cur !=NULL){
           //记录当前节点的下一个节点
           tmp = cur.next;
           //然后将当前节点指向pre
           cur.next = pre;
           //pre和cur节点都前进一位
           pre= cur;
           cur = tmp;
       }
       return pre;
    }


    public ListNode* reverseList2(ListNode* head){
        //递归终止条件是当前为空，后者下一个节点为空
        if(head == NULL || head->next== NULL){
            return head;
        }

        //这里的cur就是最后一个节点
        ListNode* cur = reverseList(head->next);

        //这里请配合动画演示理解
        //如果链表是 1-》2-》3-》4-》5，那么此时的cur就是5
        //而head是4.head的下一个是5.下下一个就是空
        //所以head.next.next 就是5-4
        head->next->next = head;
        //防止链表循环，需要将head.next设置为空
        head->next = NULL;
        //每层递归函数都返回cur，也就是最后一个节点
        return cur;


    }


    public static void main(String[] args) {
        ListNode[]  nodes = { new ListNode(1),new ListNode(2),new ListNode(3),new ListNode(4),new ListNode(5)};

        System.out.println("----begin----");
        System.out.println("nodes: "+ JSON.toJSON(nodes).toString());
        ReverseList demo = new ReverseList();
        for (int i=0; i<nodes.length; i++){
            demo.reverseList(nodes[i]);
        }

        System.out.println("-----end----");
        System.out.println("nodes: "+JSON.toJSON(nodes).toString());
    }

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
