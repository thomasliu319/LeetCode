package io.algorithm.solution.q70_climbing_stairs;

/**
 * @Author: jian.liu
 * @Description //爬楼梯
 * @Date: 2022/1/30 16:10
 */
public class Solution {

    public int climbStairs(int n) {

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }

        return  dp[n];

    }


}
