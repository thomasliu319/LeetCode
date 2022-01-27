package io.algorithm.solution.q22_generateParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: jian.liu
 * @Description //括号生成
 * @Date: 2022/1/27 12:01
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        //做减法
        List<String> res = new ArrayList<>();

        //特判断
        if(n == 0){
            return res;
        }

        //执行深度优先搜索，搜索可能的结果
        dfs("", n, n, res);

        return res;
    }

    /**
     *
     * @param curStr 当前递归得到的结果
     * @param left 左边剩余的括号数
     * @param right 右边剩余的括号数
     * @param res 结果集
     */
    void dfs(String curStr, int left, int right, List<String> res){

        //因为每一次尝试都使用新的字符变量，所以无需回溯
        //在递归终止的时候，直接将它添加到结果集即可
        if(left ==0&&right==0){
            res.add(curStr);
            return;
        }

        // 剪枝（如图，左括号可以使用的个数严格大于右括号可以使用的个数，才剪枝，注意这个细节）
        if(left > right){
            return ;
        }

        if(left>0){
            dfs(curStr+"(", left-1, right, res);
        }

        if(right>0){
            dfs(curStr+")", left, right-1, res);
        }


    }


}
