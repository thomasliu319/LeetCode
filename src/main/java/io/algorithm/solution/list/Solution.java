package io.algorithm.solution.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一棵二叉树，设计一个算法，创建含有某一深度上所有节点的链表（比如，若一棵树的深度为 D，则会创建出 D 个链表）。返回一个包含所有深度的链表的数组。
 *
 * 输入：[1,2,3,4,5,null,7,8]
 *
 *         1
 *        /  \
 *       2    3
 *      / \    \
 *     4   5    7
 *    /
 *   8
 *
 * 输出：[[1],[2,3],[4,5,7],[8]]
 *
 */
public class Solution  {

    public ListNode[] listOfDepth(TreeNode tree){
        if(tree == null) return null;
        List<ListNode> list = new ArrayList<ListNode>();
        //BFS
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(tree);
        while(!queue.isEmpty()){
            //每一层的头结点（设为哑节点）
            ListNode head = new ListNode(0);
            ListNode pre = head;
            int levelSize = queue.size();
            //将当前层的所有节点值加入到数组中
            while(levelSize>0){
                TreeNode cur = queue.poll();
                head.next = new ListNode(cur.val);
                head = head.next;
                if(cur.left != null) queue.offer(cur.left);
                if(cur.right != null) queue.offer(cur.right);
                levelSize--;
            }
            list.add(pre.next);
        }
        return list.toArray(new ListNode[0]);

    }

}
