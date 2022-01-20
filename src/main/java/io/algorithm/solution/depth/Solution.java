package io.algorithm.solution.depth;

public class Solution {

//    public int maxDepth(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        return Math.max(left, right)+1;
//    }

//BFS
//    public int maxDepth(TreeNode root){
//
//        if(root == null){
//            return 0;
//        }
//
//        int level = 0;
//
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            int size = queue.size();
//            level++;
//            for(int i =0; i< size; i++){
//                TreeNode node = queue.remove();
//                if(node.left != null) queue.add(node.left);
//                if(node.right != null) queue.add(node.right);
//            }
//
//        }
//        return level;
//    }

//DFS
    int maxLevel = 0;

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        dfs(root, 1);
        return  maxLevel;
    }

    public void dfs(TreeNode root, int level){
        if(root == null){
            return;
        }
        if(level > maxLevel) maxLevel = level;
        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }

}
