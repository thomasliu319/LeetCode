package io.algorithm.solution.q22_generateParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //括号生成
 * @Date: 2022/1/27 12:01
 */
public class Solution2 {

    public List<String> generateParenthesis(int n) {
        //做加法
        List<String> res = new ArrayList<>();

        //特判断
        if(n == 0){
            return res;
        }

        //执行深度优先搜索，搜索可能的结果
        dfs("", 0, 0, n,res);

        return res;
    }

    /**
     *
     * @param curStr 当前递归得到的结果
     * @param left 左括号书已经用了几个
     * @param right 右括号书已经用了几个
     * @param n 左括号右括号一共用了几个
     * @param res 结果集
     */
    void dfs(String curStr, int left, int right, int n,List<String> res){

        //因为每一次尝试都使用新的字符变量，所以无需回溯
        //在递归终止的时候，直接将它添加到结果集即可
        if(left == n && right == n){
            res.add(curStr);
            return;
        }

        // 剪枝（如图，左括号可以使用的个数严格大于右括号可以使用的个数，才剪枝，注意这个细节）
        if(left < right){
            return ;
        }

        if(left<n){
            dfs(curStr+"(", left+1, right, n,res);
        }

        if(right<n){
            dfs(curStr+")", left, right+1, n,res);
        }


    }


}
