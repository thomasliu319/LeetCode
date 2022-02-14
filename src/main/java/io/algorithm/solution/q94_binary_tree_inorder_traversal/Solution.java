package io.algorithm.solution.q94_binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //二叉树的中序遍历
 * @Date: 2022/2/13 21:08
 */
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(res, root);
        return res;
    }

    void dfs(List<Integer> res, TreeNode root) {
        if(root == null) return ;

        //按照左-》打印-》右的方式遍历
        dfs(res, root.left);
        res.add(root.val);
        dfs(res, root.right);
    }

}
