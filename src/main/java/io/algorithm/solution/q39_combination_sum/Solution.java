package io.algorithm.solution.q39_combination_sum;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //组合总和
 * @Date: 2022/3/8 18:30
 */
public class Solution {

//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//
//        int len = candidates.length;
//
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//
//        if(len == 0){
//            return res;
//        }
//
//        Deque<Integer> path = (Deque<Integer>) new ArrayDeque<>();
//        dfs(candidates, 0, len, target, path, res);
//        return res;
//    }
//
//    /**
//     *
//     * @param candidates 候选数组
//     * @param begin      搜索起点
//     * @param len        冗余变量，是 candidates 里的属性，可以不传
//     * @param target     每减去一个元素，目标值变小
//     * @param path       从根结点到叶子结点的路径，是一个栈
//     * @param res        结果集列表
//     */
//    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {

        // target 为负数和 0 的时候不再产生新的孩子结点
//        if(target < 0){
//            return ;
//        }
//
//
//        if(target == 0){
//            res.add(new ArrayList<>(path));
//            return;
//        }
//
//        // 重点理解这里从begin开始搜索的语义
//        for(int i =begin; i< len; i++){
//            path.addLast(candidates[i]);
//
//            // 注意：由于每一个元素可以重复使用，下一轮搜索的起点依然是 i，这里非常容易弄错
//            dfs(candidates, i, len, target - candidates[i], path, res);
//
//            // 状态重置
//            path.removeLast();
//        }

//    }


}
