package io.algorithm.solution.q53_maximum_subarray;

/**
 * @Author: jian.liu
 * @Description //53. 最大子数组和
 * @Date: 2022/2/3 14:10
 */
public class Solution {

    public int maxSubArray(int[] nums) {

       int dp[] = new int[nums.length];
       dp[0] = 0;
       int max = dp[0];

       for(int i=1; i<nums.length; i++){
           dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
           if(max < dp[i]){
               max = dp[i];
           }
       }
        return max;
    }
}
