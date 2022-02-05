package io.algorithm.solution.q617_merge_two_binary_trees;

/**
 * @Author: jian.liu
 * @Description //树节点
 * @Date: 2022/2/5 20:56
 */
public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
     this.val = val;
     this.left = left;
     this.right = right;
    }

}
