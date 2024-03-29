package io.algorithm.solution.squares;

import java.util.Arrays;

/**
 * 给定正整数n，找到若干个完全平方数（比如1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 给你一个整数 n ，返回和为 n 的完全平方数的 最少数量 。
 *
 * 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
 *示例 1：
 *
 * 输入：n = 12
 * 输出：3
 * 解释：12 = 4 + 4 + 4
 * 示例 2：
 *
 * 输入：n = 13
 * 输出：2
 * 解释：13 = 4 + 9
 *
 * 这道题如果知道数学定理之后，相当于告诉你：
 *
 * 任何正整数都可以拆分成不超过4个数的平方和 ---> 答案只可能是1,2,3,4
 * 如果一个数最少可以拆成4个数的平方和，则这个数还满足 n = (4^a)*(8b+7) ---> 因此可以先看这个数是否满足上述公式，如果不满足，答案就是1,2,3了
 * 如果这个数本来就是某个数的平方，那么答案就是1，否则答案就只剩2,3了
 * 如果答案是2，即n=a^2+b^2，那么我们可以枚举a，来验证，如果验证通过则答案是2
 * 只能是3
 */
public class Solution {

    public int numSquares(int n){
        int num = (int) Math.sqrt(n);
        int[] dp = new int[n+1];
        Arrays.fill(dp, n);
        dp[0] = 0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=n;j++){
                if(j-i*i>=0) dp[j]=Math.min(dp[j],dp[j-i*i]+1);
            }
        }
        return dp[n];
    }
}
