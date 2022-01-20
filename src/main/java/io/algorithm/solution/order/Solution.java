package io.algorithm.solution.order;


import java.util.*;

/**
 * 给定一个 N 叉树，返回其节点值的 后序遍历 。
 *
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 *
 * 进阶：
 *
 * 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * 示例 1：
 *
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：[5,6,3,2,4,1]
 * 示例 2：
 *
 * 输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * 输出：[2,6,14,11,7,3,12,8,4,13,9,10,5,1]
 *
 * 提示：
 *
 * N 叉树的高度小于或等于 1000
 * 节点总数在范围 [0,10^4] 内

 */
public class Solution {

//    public List<Integer> postorder(Node root){
//        if(root == null) return new ArrayList<Integer>();
//        Stack<Node> tmp = new Stack<>();
//        List<Integer> ret = new ArrayList<Integer>();
//        tmp.push(root);
//        while(!tmp.isEmpty()){
//            Node node = tmp.pop();
//            for(Node ans:node.children){
//                tmp.push(ans);
//            }
//            ret.add(node.val);
//        }
//        Collections.reverse(ret);
////        ret.stream().forEach(System.out::println);
//
//        return ret;
//    }

//    public List<Integer> postorder(Node root){
//       if(root == null) return new ArrayList<Integer>();
//       List<Integer> ret = new ArrayList<>();
//       LinkedList<Node> nodes = new LinkedList<>();
//       nodes.add(root);
//       while(!nodes.isEmpty()){
//           root = nodes.removeLast();
//           ret.add(0, root.val);
//           nodes.addAll(root.children);
//       }
//       return ret;
//    }

}
