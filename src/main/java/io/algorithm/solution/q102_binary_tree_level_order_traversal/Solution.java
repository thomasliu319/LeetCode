package io.algorithm.solution.q102_binary_tree_level_order_traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //二叉树的层序遍历
 * @Date: 2022/2/13 21:25
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if(root==null) return new ArrayList<List<Integer>>();

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        //将根节点放入队列中，然后不断遍历队列
        queue.add(root);

        while(queue.size() >0){
            //获取当前队列的长度，这个长度相当于 当前这一层的节点个数
            int size = queue.size();

            ArrayList<Integer> temp = new ArrayList<>();
            //将队列中的元素都拿出来(也就是获取这一层的节点)，放到临时list中
            //如果节点的左/右子树不为空，也放入队列中
            for(int i =0;i< size;++i){
                TreeNode t = queue.remove();
                temp.add(t.val);

                if(t.left !=null) {
                    queue.add(t.left);
                }

                if(t.right !=null){
                    queue.add(t.right);
                }

            }
            res.add( temp);
        }

        return res;

    }
}
