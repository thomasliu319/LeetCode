package io.algorithm.solution.q122_best_time_to_buy_and_sell_stock_ii;

/**
 * @Author: jian.liu
 * @Description //买卖股票的最佳时机 II 贪心算法（针对这道问题的特殊解法）
 * @Date: 2022/2/7 11:15
 */
public class Solution {

    /**
     * 「贪心算法」 和 「动态规划」、「回溯搜索」 算法一样，完成一件事情，是 分步决策 的；
     * 「贪心算法」 在每一步总是做出在当前看来最好的选择，我是这样理解 「最好」 这两个字的意思：
     * 「最好」 的意思往往根据题目而来，可能是 「最小」，也可能是 「最大」；
     * 贪心算法和动态规划相比，它既不看前面（也就是说它不需要从前面的状态转移过来），
     * 也不看后面（无后效性，后面的选择不会对前面的选择有影响），
     * 因此贪心算法时间复杂度一般是线性的，空间复杂度是常数级别的；
     * 这道题 「贪心」 的地方在于，对于 「今天的股价 - 昨天的股价」，得到的结果有 3 种可能：
     * ① 正数，② 00，③负数。贪心算法的决策是： 只加正数 。
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {

        int len = prices.length;
        if(len <2) return 0;

        int ans = 0;
        for(int i=1; i<len;i++){
            int diff = prices[i] - prices[i-1];

            if(diff >0){
                ans += diff;
            }
        }

        return ans;
    }
}
